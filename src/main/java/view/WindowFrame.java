package view;

import java.awt.Component;
import java.io.File;

import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

public class WindowFrame extends JFrame {

	// Variables declaration - do not modify
	private JButton buttonBrowser;
	private JButton buttonSearch;
	private JComboBox<String> jComboBoxExtension;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JScrollPane jScrollPane3;
	private JList<String> listDocuments;
	private JProgressBar progressBar;
	private JRadioButton radioButtonCaseSensitive;
	private JTextField textFieldBrowser;
	private JTextField textFieldSearch;
	// End of variables declaration

	public WindowFrame() {
		initComponents();
	}

	private void initComponents() {
		jLabel1 = new JLabel();
		buttonBrowser = new JButton();
		jLabel2 = new JLabel();
		buttonSearch = new JButton();
		jScrollPane3 = new JScrollPane();
		listDocuments = new JList<>();
		progressBar = new JProgressBar();
		radioButtonCaseSensitive = new JRadioButton();
		textFieldSearch = new JTextField();
		textFieldBrowser = new JTextField();
		jComboBoxExtension = new JComboBox<>();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jComboBoxExtension.removeAllItems();
		jComboBoxExtension.addItem("ALL");
		jComboBoxExtension.addItem("pdf");
		jComboBoxExtension.addItem("doc");
		jComboBoxExtension.addItem("docx");
		jComboBoxExtension.addItem("docx, doc");
		jComboBoxExtension.addItem("docx, pdf");
		jComboBoxExtension.addItem("doc, pdf");

		jLabel1.setText("Document Directory:");

		buttonBrowser.setText("...");
		buttonBrowser.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonBrowserActionPerformed(evt);
			}
		});

		jLabel2.setText("Find:");

		buttonSearch.setText("Search");
		buttonSearch.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				buttonSearchActionPerformed(evt);
			}
		});

		listDocuments.setModel(new AbstractListModel<String>() {
			String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };

			public int getSize() {
				return strings.length;
			}

			public String getElementAt(int i) {
				return strings[i];
			}
		});
		jScrollPane3.setViewportView(listDocuments);

		radioButtonCaseSensitive.setText("Case sensitive");
		radioButtonCaseSensitive.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				radioButtonCaseSensitiveActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane3)
						.addGroup(layout.createSequentialGroup().addComponent(jLabel1)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(textFieldBrowser)
								.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addComponent(buttonBrowser,
										GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
						.addGroup(GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup().addComponent(jLabel2)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(textFieldSearch, GroupLayout.PREFERRED_SIZE, 169,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(buttonSearch, GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(radioButtonCaseSensitive))
						.addGroup(layout.createSequentialGroup()
								.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 230, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jComboBoxExtension, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(buttonBrowser)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(textFieldBrowser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
						.addComponent(radioButtonCaseSensitive).addComponent(buttonSearch)
						.addComponent(textFieldSearch, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane3, GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
						.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
						.addGroup(GroupLayout.Alignment.TRAILING,
								layout.createSequentialGroup()
										.addComponent(jComboBoxExtension, GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
										.addContainerGap()))));

		buttonBrowser.getAccessibleContext().setAccessibleName("browserButton");

		pack();
	}// </editor-fold>

	private void buttonBrowserActionPerformed(java.awt.event.ActionEvent evt) {
		File file = fileChooserWindow();
//		textFieldBrowser.setText(file.getAbsolutePath());
//		HashSet<String> extensions = UtilFile.listExtensionInFiles(file);

//		jComboBoxExtension.addItem("xml");
//		jComboBoxExtension.addItem("xmls");
//		jComboBoxExtension.addItem("csv");

	}

	private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void radioButtonCaseSensitiveActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private File fileChooserWindow() {
		File file = null;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Seleccione la carpeta con los documentos...");
		fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		fileChooser.setAcceptAllFileFilterUsed(false);

		Component parent = null;
		if (fileChooser.showOpenDialog(parent) == JFileChooser.APPROVE_OPTION) {
			file = fileChooser.getSelectedFile();

		}

		return file;
	}

}
