/**
 * 
 */
package com.SuperApp.version01.entities;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

/**
 * @author 33000005
 *
 */
@Entity
@Table
@SqlResultSetMapping(name = "Offers", classes = @ConstructorResult(targetClass = Offers.class, 
                    columns = {@ColumnResult(name = "OfferingGuId", type = String.class), 
                    		@ColumnResult(name = "Offering", type = String.class)}))
public class Offers {

	/**
	 * 
	 */
	@Id
	private String OfferingGUId;
	private String Offering;
	public Offers() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param offeringGUId
	 * @param offering
	 */
	public Offers(String offeringGUId, String offering) {
		super();
		OfferingGUId = offeringGUId;
		Offering = offering;
	}
	public String getOfferingGUId() {
		return OfferingGUId;
	}
	public void setOfferingGUId(String offeringGUId) {
		OfferingGUId = offeringGUId;
	}
	public String getOffering() {
		return Offering;
	}
	public void setOffering(String offering) {
		Offering = offering;
	}
	
}
