/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.awt.Component;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author lucas
 */
public class ButtomColumnCellRenderer extends DefaultTableCellRenderer {
    
    private String buttomType;
    
    public ButtomColumnCellRenderer(String buttomType){
        this.buttomType = buttomType;
    }

    public String getButtomType() {
        return buttomType;
    }

    public void setButtomType(String buttomType) {
        this.buttomType = buttomType;
    }
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        label.setHorizontalAlignment( JLabel.CENTER );
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/" + buttomType + ".png")));
        
        return label;
    }
}
