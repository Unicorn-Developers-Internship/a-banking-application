package com.unicorn;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // the application allows the user to make certain transaction on his or her bank account
        //the user can view his balance which is initially set at zero(0).
        // the user can check balance, deposit and withdraw amount.
        // the user can as well check the latest previous transaction.
        BankAccount obj = new BankAccount();
        obj.showMenu();

    }
}
class BankAccount {
    int balance;
    int previousTransaction;
//    String customerName;
//    String customerId;



//    BankAccount(String cname, String cid)
//    {
//        customerName = cname;
//        customerId = cid;
//    }

    void deposit(int amount)
    {
        if(amount != 0)
        {
            balance = balance + amount;
            previousTransaction = amount;
        }
    }
    void withdraw (int amount)
    {
        if (amount != 0)
        {
            balance = balance - amount;
            previousTransaction = - amount;
        }

    }

    void gerPreviousTransaction()
    {
        if (previousTransaction > 0)
        {
            System.out.println("Deposited: " + previousTransaction);
        }
        else if (previousTransaction < 0)
        {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        }
        else
        {
            System.out.println("NO transaction occurred");
        }
    }
    void showMenu()
    {
        char option = '\0';
        Scanner scanner = new Scanner(System.in);
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your username: ");
        String customerName = sc.nextLine();
        System.out.println("Your username is : " + customerName);

        Scanner sca= new Scanner(System.in);
        System.out.println("Enter your ID: ");
        String customerId = sca.nextLine();
        System.out.println("Your Id is: " + customerId);

//        System.out.println("Welcome Mr/Mrs " + customerName);
//        System.out.println("Your ID is " + customerId);

        System.out.println("\n");
        System.out.println("A. Check Balance");
        System.out.println("B. Deposit");
        System.out.println("C. Withdraw");
        System.out.println("D. Previous transaction");
        System.out.println("E. Exit");

        do {
            System.out.println("========================================================================");
            System.out.println("Enter an option");
            System.out.println("========================================================================");
            option = scanner.next().charAt(0);
            System.out.println("\n");

            switch (option)
            {
                case 'A':
                    System.out.println("============================================================");
                    System.out.println("Balance = " + balance);
                    System.out.println("=============================================================");
                    System.out.println("\n");
                    break;
                case 'B':
                    System.out.println("==============================================================");
                    System.out.println("Enter an amount to deposit: ");
                    System.out.println("==============================================================");
                    int amount =  scanner.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 'C':
                    System.out.println("===============================================================");
                    System.out.println("Enter an amount to withdraw: ");
                    System.out.println("===============================================================");
                    int amount2 = scanner.nextInt();
                    withdraw(amount2);
                    System.out.println("\n");
                    break;
                case 'D':
                    System.out.println("===============================================================");
                    gerPreviousTransaction();
                    System.out.println("===============================================================");
                    System.out.println("\n");
                    break;
                case 'E':
                    System.out.println("===============================================================");
                    break;

                default:
                    System.out.println("Invalid Option. Enter a correct option.");
            }
        } while (option != 'E');
        System.out.println("Thank you for banking with us");
    }
}
