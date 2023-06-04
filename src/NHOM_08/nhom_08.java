/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NHOM_08;

import GUI.CuaHang;
import GUI.MAIN;

/**
 *
 * @author nhuyd
 */
public class nhom_08 {
    public static  GUI.MAIN frmTC=new MAIN();
    public static DAO.clsConnectDB connection = new  DAO.clsConnectDB ();
    public static GUI.CuaHang frmCH = new CuaHang();
    public static void main(String[] args) {
       GUI.DangNhap frmDN= new   GUI.DangNhap();
  
       frmDN.show();
    }
}
