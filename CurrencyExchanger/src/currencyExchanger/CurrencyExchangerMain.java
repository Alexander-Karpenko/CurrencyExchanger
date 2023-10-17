package currencyExchanger;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class CurrencyExchangerMain  {

	//сделать выпадающее меню, реализовать логику конвертирования

	public static void main(String[] args) {
		System.out.println("git test");
		System.out.println("commit 2");
		System.out.println("redact from Githab2");
		1CurrencyExchangerMetods CurrExchang = new CurrencyExchangerMetods(Currency.DOLLARS, Currency.DOLLARS);
//		CurrExchang.setInputValue(1);
//		CurrExchang.Exchange();
		//CurrExchang.setCurrency(Currency.Dollar);
		//System.out.println(CurrExchang.getCurrency());e
		//System.out.println(CurrExchang.getOutputValue());
		
		
		//выкинуть отдельно 
		JFrame jframe = new JFrame() ;
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(jframe.EXIT_ON_CLOSE);
		jframe.setBounds(600, 300, 600, 300);
		jframe.setTitle("currencyExchanger1");
		
		//
		
		//
			JComboBox<Currency> comboBox = new JComboBox();
			comboBox.addItem(Currency.DOLLARS);
			comboBox.addItem(Currency.RUBLES);
			comboBox.addItem(Currency.TENGE);
			
			JPanel comboPanel = new JPanel();
			comboPanel.add(comboBox);
			jframe.getContentPane().add(BorderLayout.WEST, comboPanel);
			
			ActionListener actionListener = new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	CurrExchang.setInputCurrency((Currency)comboBox.getSelectedItem());
			    }
			};
			
			comboBox.addActionListener(actionListener);
		//
			
		//
			JComboBox<Currency> comboBox2 = new JComboBox();
			comboBox2.addItem(Currency.DOLLARS);
			comboBox2.addItem(Currency.RUBLES);
			comboBox2.addItem(Currency.TENGE);
			
			JPanel comboPanel2 = new JPanel();
			comboPanel2.add(comboBox2);
			jframe.getContentPane().add(BorderLayout.LINE_END, comboPanel2);
			
			ActionListener actionListener2 = new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			    	CurrExchang.setOutputCurrency((Currency)comboBox2.getSelectedItem());
			    }
			};
			
			comboBox2.addActionListener(actionListener2);
		//
			
		//
		JPanel panelIn = new JPanel();
		JLabel label = new JLabel("Введите число");
		JTextField tf = new JTextField(10);
		JButton send = new JButton("Отправить");

		panelIn.add(label);
		panelIn.add(tf);
		panelIn.add(send);

		jframe.getContentPane().add(BorderLayout.CENTER, panelIn);
		//
		
		//
		JPanel panelOut = new JPanel();
		JLabel label2 = new JLabel("Получи!");
		JTextField tfRes = new JTextField(10);

		panelOut.add(label2);
		panelOut.add(tfRes);

		jframe.getContentPane().add(BorderLayout.AFTER_LAST_LINE, panelOut);
		//
		
		//
		send.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				  String temp = tf.getText();
				  try {
				  CurrExchang.setInputValue(Double.parseDouble(temp));
				  CurrExchang.Exchange();
				  tfRes.setText(String.format("%.3f",CurrExchang.getOutputValue()).replaceAll(",", "."));
				  //Вывести значение в окно
				  }catch(Exception iOException) {
					  System.err.println("ошибка");// вывод ошибки в одтельное окно
				  }
			}
        });
		//
		jframe.setVisible(true);
	}

}
