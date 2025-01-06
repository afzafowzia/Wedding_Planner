package weddingplanner;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author rafia
 */
public class BankPayment extends Payment implements Serializable{

    public BankPayment() {
    }
   
    protected String selectBank;
    protected int bankAccountNo,RoutingNo,invoiceNumber;
    


    public BankPayment(String selectBank, int bankAccountNo, int RoutingNo, int invoiceNumber) {
        this.selectBank = selectBank;
        this.bankAccountNo = bankAccountNo;
        this.RoutingNo = RoutingNo;
        this.invoiceNumber=invoiceNumber;
    }

    public BankPayment(String selectBank, int bankAccountNo, int RoutingNo, int vendorId, int paymentAmount, String selectVendor, LocalDate dop,int invoiceNumber) {
        super(vendorId, paymentAmount, selectVendor, dop);
        this.selectBank = selectBank;
        this.bankAccountNo = bankAccountNo;
        this.RoutingNo = RoutingNo;
        this.invoiceNumber=invoiceNumber;
    }

    public String getSelectBank() {
        return selectBank;
    }

    public void setSelectBank(String selectBank) {
        this.selectBank = selectBank;
    }

    public int getBankAccountNo() {
        return bankAccountNo;
    }

    public void setBankAccountNo(int bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    public int getRoutingNo() {
        return RoutingNo;
    }

    public void setRoutingNo(int RoutingNo) {
        this.RoutingNo = RoutingNo;
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public int getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(int paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getSelectVendor() {
        return selectVendor;
    }

    public void setSelectVendor(String selectVendor) {
        this.selectVendor = selectVendor;
    }

    public LocalDate getDop() {
        return dop;
    }

    public void setDop(LocalDate dop) {
        this.dop = dop;
    }

    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    @Override
    public String toString() {
        return "BankPayment{" + "selectBank=" + selectBank + ", bankAccountNo=" + bankAccountNo + ", RoutingNo=" + RoutingNo + ", invoiceNumber=" + invoiceNumber + '}';
    }

    

   

    
    
    
   
}
