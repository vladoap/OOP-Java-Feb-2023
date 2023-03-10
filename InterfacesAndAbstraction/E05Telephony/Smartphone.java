package InterfacesAndAbstraction.E05Telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable {

    private List<String> numbers;
    private List<String> urls;

    public Smartphone(List<String> numbers, List<String> urls) {
        this.numbers = numbers;
        this.urls = urls;
    }


    @Override
    public String browse() {
        StringBuilder sb = new StringBuilder();

        for (String url : urls) {
            if (hasDigits(url)) {
                sb.append("Invalid URL!")
                        .append(System.lineSeparator());
            } else {
                sb.append(String.format("Browsing: %s!", url))
                        .append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private boolean hasDigits(String url) {
        for (char singleSymbol : url.toCharArray()) {
            if (Character.isDigit(singleSymbol)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String call() {
        StringBuilder sb = new StringBuilder();

        for (String number : numbers) {
            if (hasOnlyDigits(number)) {
                sb.append(String.format("Calling... %s", number))
                        .append(System.lineSeparator());
            } else {
                sb.append("Invalid number!")
                        .append(System.lineSeparator());
            }
        }
        return sb.toString();
    }

    private boolean hasOnlyDigits(String numbers) {
        for (char number : numbers.toCharArray()) {
            if (!Character.isDigit(number)) {
                return false;
            }
        }
        return true;
    }


}
