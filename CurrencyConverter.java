stem.out.println(amount + " Dollars = " + f.format(pound) + " Pounds");
                                euro = amount * 0.88;
                                System.out.println(amount + " Dollars = " + f.format(euro) + " Euros");
                                break;
                        case "pounds":
                                // For Pound Conversion
                                dollar = amount + 1.36;
                                System.out.println(amount + " Pounds = " + f.format(dollar) + " Dollars");
                                euro = amount * 1.19;
                                System.out.println(amount + " Pound = " + f.format(euro) + " Euros");
                                break;
                        case "euros":
                                // For Euro Conversion
                                dollar = amount * 1.31;
                                System.out.println(amount + " Euros = " + f.format(dollar) + " Dollars");
                                pound = amount * 0.84;
                                System.out.println(amount + " Euros = " + f.format(pound) + " Pounds");
                                break;
                }
                System.out.println("Thank you for using the converter.");
        }

}

