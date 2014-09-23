/******************************************************************************
 * Product: Adempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2007 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.util.KeyNamePair;

/** Generated Interface for HR_Emp_Token
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS
 */
public interface I_HR_Emp_Token 
{
// Kindly do not delete below line as it is being used for svn version maintenance
public static final String svnRevision =  "$Id: I_HR_Emp_Token.java 1009 2012-02-09 09:16:13Z suman $";

    /** TableName=HR_Emp_Token */
    public static final String Table_Name = "HR_Emp_Token";

    /** AD_Table_ID=7000007 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Employee.
	  * Identifies a Employee
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Employee.
	  * Identifies a Employee
	  */
	public int getC_BPartner_ID();

	public I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name currmonthsal */
    public static final String COLUMNNAME_currmonthsal = "currmonthsal";

	/** Set currmonthsal	  */
	public void setcurrmonthsal (BigDecimal currmonthsal);

	/** Get currmonthsal	  */
	public BigDecimal getcurrmonthsal();

    /** Column name HR_Emp_Token_ID */
    public static final String COLUMNNAME_HR_Emp_Token_ID = "HR_Emp_Token_ID";

	/** Set HR_Emp_Token	  */
	public void setHR_Emp_Token_ID (int HR_Emp_Token_ID);

	/** Get HR_Emp_Token	  */
	public int getHR_Emp_Token_ID();

    /** Column name HR_Period_ID */
    public static final String COLUMNNAME_HR_Period_ID = "HR_Period_ID";

	/** Set Payroll Period	  */
	public void setHR_Period_ID (int HR_Period_ID);

	/** Get Payroll Period	  */
	public int getHR_Period_ID();

	public org.eevolution.model.I_HR_Period getHR_Period() throws RuntimeException;

    /** Column name HR_Token_ID */
    public static final String COLUMNNAME_HR_Token_ID = "HR_Token_ID";

	/** Set Token	  */
	public void setHR_Token_ID (int HR_Token_ID);

	/** Get Token	  */
	public int getHR_Token_ID();

	public I_HR_Token getHR_Token() throws RuntimeException;

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name issuedate */
    public static final String COLUMNNAME_issuedate = "issuedate";

	/** Set issuedate	  */
	public void setissuedate (Timestamp issuedate);

	/** Get issuedate	  */
	public Timestamp getissuedate();

    /** Column name nooftokens */
    public static final String COLUMNNAME_nooftokens = "nooftokens";

	/** Set nooftokens	  */
	public void setnooftokens (int nooftokens);

	/** Get nooftokens	  */
	public int getnooftokens();

    /** Column name prevmonthsal */
    public static final String COLUMNNAME_prevmonthsal = "prevmonthsal";

	/** Set prevmonthsal	  */
	public void setprevmonthsal (BigDecimal prevmonthsal);

	/** Get prevmonthsal	  */
	public BigDecimal getprevmonthsal();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name tokenamount */
    public static final String COLUMNNAME_tokenamount = "tokenamount";

	/** Set tokenamount	  */
	public void settokenamount (BigDecimal tokenamount);

	/** Get tokenamount	  */
	public BigDecimal gettokenamount();

    /** Column name tokenlevel */
    public static final String COLUMNNAME_tokenlevel = "tokenlevel";

	/** Set tokenlevel	  */
	public void settokenlevel (String tokenlevel);

	/** Get tokenlevel	  */
	public String gettokenlevel();

    /** Column name totalamount */
    public static final String COLUMNNAME_totalamount = "totalamount";

	/** Set totalamount	  */
	public void settotalamount (BigDecimal totalamount);

	/** Get totalamount	  */
	public BigDecimal gettotalamount();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
