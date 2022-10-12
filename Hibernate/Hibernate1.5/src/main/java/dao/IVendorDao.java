package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Vendor;

public interface IVendorDao {
	// Add vendor
	String addVendorDetail(Vendor vendor);

	String loginVendor(String email, String pass);
	
	String deleteAll(Double regAmount,LocalDate date);
	
	 String updateRegAmt(String mail, Double newRegAmt);
	 
	 List<Vendor> getAllVendor();
	 
	 Vendor findByVendorId(int vendorId);
}
