package view;

import java.io.File;

import javax.swing.AbstractListModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileNameExtensionFilter;

public class WindowFrame extends JFrame {

	// Variables declaration - do not modify
	private JButton buttonBrowser;
	private JButton buttonSearch;
	private JLabel jLabel1;
	private JLabel jLabel2;
	private JScrollPane jScrollPane3;
	private JScrollPane jScrollPane4;
	private JScrollPane jScrollPane5;
	private JList<String> listDocuments;
	private JProgressBar progressBar;
	private JTextPane textPanePath;
	private JTextPane textPaneSearch;

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
		jScrollPane4 = new JScrollPane();
		textPanePath = new JTextPane();
		jScrollPane5 = new JScrollPane();
		textPaneSearch = new JTextPane();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

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

		jScrollPane4.setViewportView(textPanePath);

		jScrollPane5.setViewportView(textPaneSearch);

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(jScrollPane3)
						.addComponent(progressBar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(layout.createSequentialGroup()
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
										.addGroup(layout.createSequentialGroup().addComponent(jLabel2)
												.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 285,
														GroupLayout.PREFERRED_SIZE))
										.addGroup(GroupLayout.Alignment.LEADING,
												layout.createSequentialGroup().addComponent(jLabel1)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jScrollPane4)))
								.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
										.addComponent(buttonSearch, GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
										.addComponent(buttonBrowser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false).addComponent(jScrollPane4)
						.addComponent(buttonBrowser)
						.addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
				.addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING).addGroup(layout
						.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addComponent(jLabel2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 25,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(buttonSearch)))
						.addGroup(layout.createSequentialGroup()
								.addComponent(jScrollPane5, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
								.addGap(1, 1, 1)))
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
				.addComponent(jScrollPane3, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
				.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(progressBar,
						GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
				.addContainerGap()));

		buttonBrowser.getAccessibleContext().setAccessibleName("browserButton");

		pack();
	}// </editor-fold>

	private void buttonBrowserActionPerformed(java.awt.event.ActionEvent evt) {
		fileChooserWindow();
	}

	private void buttonSearchActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private String fileChooserWindow() {
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setCurrentDirectory(new File("C:\\Users\\Lucio\\Documents\\Proyectos\\ConfigItemsExtractor"));
		fileChooser.showOpenDialog(fileChooser);
		return fileChooser.getSelectedFile().getAbsolutePath();
	}

}
