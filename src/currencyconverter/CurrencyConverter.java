/*Group Name: BLINK

Group Members
1.SHARUL IRFAN BIN SHARUL ISRAM (1921825)
2.MUHAMMAD ZIKRY ADIB BIN MOHD SUHAIMI (2112197)
3.RAIDAH BINTI RASHIDI (2112866)
4.MOHAMAD AIMAN AKIM ADANAN (2113823)
5.RAIHANATUZZAHRA BINTI AZMI (2114488)
6.ADAM KHUARIZMI BIN MASZLAN (2115347)
7.TANJIM MST MOBASSHIRA SADIA (1824612)*/

package currencyconverter;

// ...existing code...
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//Inheritance: "CurrencyConverter" sub-class extends to super-class "Application" .CurrencyConverter also type of Application//

public class CurrencyConverter extends JFrame {

    JTextField amount;
    List<String> currencyList = Arrays.asList("USD", "JPY", "GBP", "IDR", "THB", "SGD", "PHP", "BND", "MMK", "KHR", "VND", "LAK", "MYR", "EUR", "AUD", "CAD", "CNY", "INR");

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CurrencyConverter converter = new CurrencyConverter();
            converter.setVisible(true);
        });
    }

    public CurrencyConverter() {
        setTitle("Currency Converter");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        JLabel nLabelTitle = new JLabel("Currency Converter");
        nLabelTitle.setFont(new Font("Imperial", Font.BOLD, 24));
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(nLabelTitle, gbc);

        JLabel nLabel1 = new JLabel("Enter amount ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(nLabel1, gbc);

        amount = new JTextField(10);
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(amount, gbc);

        JLabel nLabel2 = new JLabel("Convert from ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(nLabel2, gbc);

        JComboBox<String> fromCurrency = new JComboBox<>(currencyList.toArray(new String[0]));
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(fromCurrency, gbc);

        JLabel nLabel3 = new JLabel("Convert to ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(nLabel3, gbc);

        JComboBox<String> toCurrency = new JComboBox<>(currencyList.toArray(new String[0]));
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(toCurrency, gbc);

        JButton btn = new JButton("Convert");
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        add(btn, gbc);

        JLabel nLabel5 = new JLabel("CONVERSION RESULT = ");
        nLabel5.setFont(new Font("Arial Bold", Font.PLAIN, 15));
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 1;
        add(nLabel5, gbc);

        JLabel resultLabel = new JLabel("  ");
        resultLabel.setFont(new Font("Arial Bold", Font.PLAIN, 20));
        gbc.gridx = 1;
        gbc.gridy = 5;
        add(resultLabel, gbc);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double result = convert((String) fromCurrency.getSelectedItem(), (String) toCurrency.getSelectedItem(), Double.parseDouble(amount.getText()));
                resultLabel.setText(result + " " + toCurrency.getSelectedItem());
            }
        });
    }

    //convert method making in MYR from other currency and also making in other currency from MYR
    private double convert(String from, String to, double value) {

        System.out.println(from + " " + to + " " + value);

        // First convert value to MYR

        switch (from) {

            case "USD":
                value = 4.39 * value;
                break;

            case "JPY":
                value = 0.03 * value;
                break;

            case "GBP":
                value = 5.54 * value;
                break;

            case "IDR":
                value = 0.00030 * value;
                break;

            case "THB":
                value = 0.12 * value;
                break;

            case "SGD":
                value = 3.20 * value;
                break;

            case "PHP":
                value = 0.08 * value;
                break;

            case "BND":
                value = 3.20 * value;
                break;

            case "MMK":
                value = 0.0023 * value;
                break;

            case "KHR":
                value = 0.0010 * value;
                break;

            case "VND":
                value = 0.00018 * value;
                break;

            case "LAK":
                value = 0.00033 * value;
                break;

            case "MYR":
                value = 1.00 * value;
                break;

            case "EUR":
                value = 4.90 * value;
                break;

            case "AUD":
                value = 3.20 * value;
                break;

            case "CAD":
                value = 3.40 * value;
                break;

            case "CNY":
                value = 0.69 * value;
                break;

            case "INR":
                value = 0.056 * value;
                break;

            default:
                break;

        }

        // Now to make required currency in MYR.

        switch (to) {

            case "USD":
                return value * 0.22;

            case "JPY":
                return value * 28.81;

            case "GBP":
                return value * 0.18;

            case "IDR":
                return value * 3319.09;

            case "THB":
                return value * 7.77;

            case "SGD":
                return value * 0.31;

            case "PHP":
                return value * 11.89;

            case "BND":
                return value * 0.31;

            case "MMK":
                return value * 420.46;

            case "KHR":
                return value * 921.86;

            case "VND":
                return value * 5311.31;

            case "LAK":
                return value * 3013.66;

            case "MYR":
                return value;

            case "EUR":
                return value * 0.20;

            case "AUD":
                return value * 0.31;

            case "CAD":
                return value * 0.29;

            case "CNY":
                return value * 1.45;

            case "INR":
                return value * 17.86;

            default:
                break;

        }

        return value;

    }

    public String method(String goodwish) {
        String goodwish1 = "Thank you, come again";

        System.out.println(goodwish1 + " ");
        return goodwish1;
    }

}