package weddingplanner;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author rafia
 */
public class BkashPayment extends Payment implements Serializable{
    
    protected int Bkashno,invoiceNumber;

    public BkashPayment() {
    }

    public BkashPayment(int Bkashno,int invoiceNumber) {
        this.Bkashno = Bkashno;
        this.invoiceNumber=invoiceNumber;
    }

    public BkashPayment(int Bkashno, int vendorId, int paymentAmount, String selectVendor, LocalDate dop, int invoiceNumber) {
        super(vendorId, paymentAmount, selectVendor, dop);
        this.Bkashno = Bkashno;
        this.invoiceNumber=invoiceNumber;
    }

    public int getBkashno() {
        return Bkashno;
    }

    public void setBkashno(int Bkashno) {
        this.Bkashno = Bkashno;
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
        return "BkashPayment{" + "Bkashno=" + Bkashno + ", invoiceNumber=" + invoiceNumber + '}';
    }

    
    
}
