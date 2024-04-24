package com.sg.classroster.ui;

import java.util.Scanner;

public class UserIOConsoleImpl implements UserIO {

    @Override
    public void print(String message) {
        System.out.println(message);
    }
    @Override
    public String readString(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();
    }
    @Override
    public int readInt(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return Integer.parseInt(sc.nextLine());
    }
    @Override
    public int readInt(String prompt, int min, int max) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println(prompt);
        while (true) {
            try {
                num = Integer.parseInt(sc.nextLine());
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println("Input number out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return Double.parseDouble(sc.nextLine());
    }
    @Override
    public double readDouble(String prompt, double min, double max) {
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println(prompt);
        while (true) {
            try {
                num = Double.parseDouble(sc.nextLine());
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println("Input number out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return num;
    }
    @Override
    public float readFloat(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return Float.parseFloat(sc.nextLine());
    }
    @Override
    public float readFloat(String prompt, float min, float max) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.println(prompt);
        while (true) {
            try {
                num = Float.parseFloat(sc.nextLine());
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println("Input number out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return num;
    }

    @Override
    public long readLong(String prompt){
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return Long.parseLong(sc.nextLine());
    }
    @Override
    public long readLong(String prompt, long min, long max) {
        Scanner sc = new Scanner(System.in);
        long num;
        System.out.println(prompt);
        while (true) {
            try {
                num = Long.parseLong(sc.nextLine());
                if (num >= min && num <= max) {
                    break;
                } else {
                    System.out.println("Input number out of range.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            }
        }
        return num;
    }
}
