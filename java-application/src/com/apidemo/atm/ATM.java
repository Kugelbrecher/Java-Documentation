package com.apidemo.atm;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ATM {
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private Scanner scanner = new Scanner(System.in);
    private Account loggedInAccount;

    public void start() {
        while (true) { // short-cut: control + option + t to surround code with specific block
            System.out.println("Welcome to ATM");
            System.out.println("1. Create Account");
            System.out.println("2. Account Login");
            System.out.println("3. Exit");
            System.out.println("Choose Option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }

    private void createAccount() {
        Account account = new Account();

        System.out.println("Please enter your name: ");
        account.setAccountHolder(scanner.next());

        while (true) {
            System.out.println("Please enter your gender (m/f): ");
            char gender = scanner.next().charAt(0); // select char from string at index 0
            if (gender == 'm' || gender == 'f') {
                account.setGender(gender);
                break;
            } else {
                System.out.println("Invalid gender");
            }
        }

        while (true) {
            System.out.println("Please enter your password: ");
            String password = scanner.next();
            System.out.println("Please confirm your password: ");
            String password2 = scanner.next();
            if (!password.equals(password2)) {
                System.out.println("Password does not match");
            } else {
                account.setPassWord(password);
                break;
            }
        }

        System.out.println("Please enter your limit: ");
        account.setLimit(scanner.nextDouble());

        String accountNumber = autoGenerateAccountNumber();
        account.setAccountNumber(accountNumber);

        accounts.add(account);
        System.out.println("Congrats " + account.getAccountHolder() + ", your account has been created.");
        System.out.println("Your account number is: " + account.getAccountNumber());
    }

    private String autoGenerateAccountNumber() {
        String accountNumber = "";

        Random random = new Random();
        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // 0-9
            accountNumber += digit;
        }

        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return autoGenerateAccountNumber();
            }
        }

        return accountNumber;

    }

    private void login() {
        System.out.println("ATM Login");

        // check if account available
        if (accounts.size() == 0) {
            System.out.println("No account available");
            return;
        }

        // input account number and password
        while (true) {
            System.out.println("Enter your account number: ");
            String accountNumber = scanner.next();

            // find if account number exists
            Account account = null;
            for (Account acc : accounts) {
                if (acc.getAccountNumber().equals(accountNumber)) {
                    account = acc;
                    break;
                }
            }

            if (account == null) {
                System.out.println("Account not found");
                return;
            } else {
                while (true) {
                    System.out.println("Enter your password: ");
                    String password = scanner.next();

                    if (account.getPassWord().equals(password)) {
                        loggedInAccount = account;
                        System.out.println("Login success " + account.getAccountHolder());
                        showAccountMenu();
                        return; // exit from this method to welcome menu
                    } else {
                        System.out.println("Invalid password");
                    }
                }
            }
        }
    }

    private void showAccountMenu() {
        while (true) {
            System.out.println(loggedInAccount.getAccountHolder() + ", welcome to your account");
            System.out.println("1. Show Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transfer");
            System.out.println("5. Change Password");
            System.out.println("6. Logout");
            System.out.println("7. Close Account");
            System.out.println("Choose Option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    showAccount();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    withdraw();
                    break;
                case 4:
                    transfer(); // shortcut: option + enter and select create method
                    break;
                case 5:
                    changePassword();
                    return; // go back to main menu
                case 6:
//                    loggedInAccount = null;
                    System.out.println("Logout success");
                    return; // exit from this method
                case 7:
                    if (closeAccount()) {
                        return; // exit from this method
                    }
                    break; // if account not closed, jump out of switch case and continue menu loop
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }

    }


    private void showAccount() {
        System.out.println("Your Account Details");
        System.out.println("Account Number: " + loggedInAccount.getAccountNumber());
        System.out.println("Account Holder: " + loggedInAccount.getAccountHolder());
        System.out.println("Gender: " + loggedInAccount.getGender());
        System.out.println("Balance: " + loggedInAccount.getBalance());
        System.out.println("Limit: " + loggedInAccount.getLimit());
    }

    private void deposit() {
        System.out.println("Enter amount to deposit: ");
        double amount = scanner.nextDouble();

        loggedInAccount.setBalance(loggedInAccount.getBalance() + amount);
        System.out.println("Deposit success");
    }

    private void withdraw() {
        while (true) {
            System.out.println("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();

            if (amount <= loggedInAccount.getBalance()) {
                if (amount <= loggedInAccount.getLimit()) {
                    loggedInAccount.setBalance(loggedInAccount.getBalance() - amount);
                    System.out.println("Withdraw success");
                    System.out.println("Your balance is: " + loggedInAccount.getBalance());
                    break;
                } else {
                    System.out.println("Exceed limit");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        }
    }

    private void transfer() {
        System.out.println("Transfer Money");

        if (accounts.size() < 2) {
            System.out.println("No account available to transfer");
            return;
        }

        if (loggedInAccount.getBalance() == 0) {
            System.out.println("No balance to transfer");
            return;
        }

        while (true) {
            System.out.println("Enter account number to transfer: ");
            String accountNumber = scanner.next();
            Account receiverAccount = null;
            for (Account account : accounts) {
                if (account.getAccountNumber().equals(accountNumber)) {
                    receiverAccount = account;
                    break;
                }
            }

            if (receiverAccount == null) {
                System.out.println("Account not found");
                return;
            } else {
                System.out.println("Confirm enter account holder first name: ");
                String receiverName = "*" + receiverAccount.getAccountHolder().substring(1);
                String preName = scanner.next();
                if (receiverAccount.getAccountHolder().startsWith(preName)) {
                    while (true) {
                        System.out.println("Enter amount to transfer: ");
                        double amount = scanner.nextDouble();
                        if (amount <= loggedInAccount.getBalance()) {
                            loggedInAccount.setBalance(loggedInAccount.getBalance() - amount);
                            receiverAccount.setBalance(receiverAccount.getBalance() + amount);
                            // break; // only jump out from the inner loop
                            return; // jump out from the method transfer
                        } else {
                            System.out.println("Insufficient balance, your balance is: " + loggedInAccount.getBalance());
                        }
                    }
                } else {
                    System.out.println("Invalid account holder name");
                }
            }
        }
    }

    private boolean closeAccount() {
        System.out.println("Close Account");
        System.out.println("Are you sure to close your account? (y/n)");
        String option = scanner.next();
        switch (option) {
            case "y":
                if (loggedInAccount.getBalance() == 0) {
                    accounts.remove(loggedInAccount);
                    System.out.println("Account closed");
                    return true;
                } else {
                    System.out.println("Account balance must be 0 to close");
                    return false; // note we do not need break anymore because we return
                }
            default:
                System.out.println("Account not closed");
                return false;
        }
    }

    private void changePassword() {
        System.out.println("Change Password");

        while (true) {
            System.out.println("Enter your current password: ");
            String currentPassword = scanner.next();

            if (loggedInAccount.getPassWord().equals(currentPassword)) {
                while (true) {
                    System.out.println("Enter new password: ");
                    String newPassword = scanner.next();
                    System.out.println("Confirm new password: ");
                    String newPassword2 = scanner.next();
                    if (newPassword.equals(newPassword2)) {
                        loggedInAccount.setPassWord(newPassword);
                        System.out.println("Password changed");
                        return;
                    } else {
                        System.out.println("Password does not match");
                    }
                }
            } else {
                System.out.println("Invalid current password");
            }
        }
    }
}
