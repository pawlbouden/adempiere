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
/** Generated Model - DO NOT CHANGE */
package org.compiere.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.util.Env;

/** Generated Model for HR_SalaryChange
 *  @author Adempiere (generated) 
 *  @version Release 3.6.0LTS - $Id: X_HR_SalaryChange.java 1009 2012-02-09 09:16:13Z suman $ */
public class X_HR_SalaryChange extends PO implements I_HR_SalaryChange, I_Persistent 
{
// Kindly do not delete below line as it is being used for svn version maintenance
public static final String svnRevision =  "$Id: X_HR_SalaryChange.java 1009 2012-02-09 09:16:13Z suman $";

	/**
	 *
	 */
	private static final long serialVersionUID = 20111231L;

    /** Standard Constructor */
    public X_HR_SalaryChange (Properties ctx, int HR_SalaryChange_ID, String trxName)
    {
      super (ctx, HR_SalaryChange_ID, trxName);
      /** if (HR_SalaryChange_ID == 0)
        {
			setC_BPartner_ID (0);
			setC_Year_ID (0);
			setHR_Period_ID (0);
			setHR_SalaryChange_ID (0);
			setnewdailywage (Env.ZERO);
			setnewsalary (Env.ZERO);
			setolddailywage (Env.ZERO);
			setoldsalary (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_HR_SalaryChange (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org 
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuffer sb = new StringBuffer ("X_HR_SalaryChange[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set arrierscalculated.
		@param arrierscalculated arrierscalculated	  */
	public void setarrierscalculated (boolean arrierscalculated)
	{
		set_Value (COLUMNNAME_arrierscalculated, Boolean.valueOf(arrierscalculated));
	}

	/** Get arrierscalculated.
		@return arrierscalculated	  */
	public boolean isarrierscalculated () 
	{
		Object oo = get_Value(COLUMNNAME_arrierscalculated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	public I_C_BPartner getC_BPartner() throws RuntimeException
    {
		return (I_C_BPartner)MTable.get(getCtx(), I_C_BPartner.Table_Name)
			.getPO(getC_BPartner_ID(), get_TrxName());	}

	/** Set Employee.
		@param C_BPartner_ID 
		Identifies a Employee
	  */
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1) 
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else 
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Employee.
		@return Identifies a Employee
	  */
	public int getC_BPartner_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_C_Year getC_Year() throws RuntimeException
    {
		return (I_C_Year)MTable.get(getCtx(), I_C_Year.Table_Name)
			.getPO(getC_Year_ID(), get_TrxName());	}

	/** Set Year.
		@param C_Year_ID 
		Calendar Year
	  */
	public void setC_Year_ID (int C_Year_ID)
	{
		if (C_Year_ID < 1) 
			set_Value (COLUMNNAME_C_Year_ID, null);
		else 
			set_Value (COLUMNNAME_C_Year_ID, Integer.valueOf(C_Year_ID));
	}

	/** Get Year.
		@return Calendar Year
	  */
	public int getC_Year_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Year_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.eevolution.model.I_HR_Period getHR_Period() throws RuntimeException
    {
		return (org.eevolution.model.I_HR_Period)MTable.get(getCtx(), org.eevolution.model.I_HR_Period.Table_Name)
			.getPO(getHR_Period_ID(), get_TrxName());	}

	/** Set Payroll Period.
		@param HR_Period_ID Payroll Period	  */
	public void setHR_Period_ID (int HR_Period_ID)
	{
		if (HR_Period_ID < 1) 
			set_Value (COLUMNNAME_HR_Period_ID, null);
		else 
			set_Value (COLUMNNAME_HR_Period_ID, Integer.valueOf(HR_Period_ID));
	}

	/** Get Payroll Period.
		@return Payroll Period	  */
	public int getHR_Period_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_Period_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Salary change.
		@param HR_SalaryChange_ID Salary change	  */
	public void setHR_SalaryChange_ID (int HR_SalaryChange_ID)
	{
		if (HR_SalaryChange_ID < 1) 
			set_ValueNoCheck (COLUMNNAME_HR_SalaryChange_ID, null);
		else 
			set_ValueNoCheck (COLUMNNAME_HR_SalaryChange_ID, Integer.valueOf(HR_SalaryChange_ID));
	}

	/** Get Salary change.
		@return Salary change	  */
	public int getHR_SalaryChange_ID () 
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_HR_SalaryChange_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set newdailywage.
		@param newdailywage newdailywage	  */
	public void setnewdailywage (BigDecimal newdailywage)
	{
		set_Value (COLUMNNAME_newdailywage, newdailywage);
	}

	/** Get newdailywage.
		@return newdailywage	  */
	public BigDecimal getnewdailywage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newdailywage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set newsalary.
		@param newsalary newsalary	  */
	public void setnewsalary (BigDecimal newsalary)
	{
		set_Value (COLUMNNAME_newsalary, newsalary);
	}

	/** Get newsalary.
		@return newsalary	  */
	public BigDecimal getnewsalary () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_newsalary);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set olddailywage.
		@param olddailywage olddailywage	  */
	public void setolddailywage (BigDecimal olddailywage)
	{
		set_Value (COLUMNNAME_olddailywage, olddailywage);
	}

	/** Get olddailywage.
		@return olddailywage	  */
	public BigDecimal getolddailywage () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_olddailywage);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set oldsalary.
		@param oldsalary oldsalary	  */
	public void setoldsalary (BigDecimal oldsalary)
	{
		set_Value (COLUMNNAME_oldsalary, oldsalary);
	}

	/** Get oldsalary.
		@return oldsalary	  */
	public BigDecimal getoldsalary () 
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_oldsalary);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Processed.
		@param Processed 
		The document has been processed
	  */
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed () 
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set salaryupdated.
		@param salaryupdated salaryupdated	  */
	public void setsalaryupdated (boolean salaryupdated)
	{
		set_Value (COLUMNNAME_salaryupdated, Boolean.valueOf(salaryupdated));
	}

	/** Get salaryupdated.
		@return salaryupdated	  */
	public boolean issalaryupdated () 
	{
		Object oo = get_Value(COLUMNNAME_salaryupdated);
		if (oo != null) 
		{
			 if (oo instanceof Boolean) 
				 return ((Boolean)oo).booleanValue(); 
			return "Y".equals(oo);
		}
		return false;
	}
}