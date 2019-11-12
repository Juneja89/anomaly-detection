package com.oaknorth.drools;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class RatioValue implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "RATIOVALUES_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "RATIOVALUES_ID_GENERATOR", sequenceName = "RATIOVALUES_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Financial Year")
	private java.lang.String financialYear;

	@org.kie.api.definition.type.Label("Data")
	private double data;

	@org.kie.api.definition.type.Label("Absolute Anomaly")
	private int absoluteAnomaly;

	@org.kie.api.definition.type.Label("Ratio Name")
	private java.lang.String ratioName;

	@org.kie.api.definition.type.Label("Slope")
	private double slope;

	public RatioValue() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getFinancialYear() {
		return this.financialYear;
	}

	public void setFinancialYear(java.lang.String financialYear) {
		this.financialYear = financialYear;
	}

	public double getData() {
		return this.data;
	}

	public void setData(double data) {
		this.data = data;
	}

	public int getAbsoluteAnomaly() {
		return this.absoluteAnomaly;
	}

	public void setAbsoluteAnomaly(int absoluteAnomaly) {
		this.absoluteAnomaly = absoluteAnomaly;
	}

	public java.lang.String getRatioName() {
		return this.ratioName;
	}

	public void setRatioName(java.lang.String ratioName) {
		this.ratioName = ratioName;
	}

	public double getSlope() {
		return this.slope;
	}

	public void setSlope(double slope) {
		this.slope = slope;
	}

	public RatioValue(java.lang.Long id, java.lang.String financialYear,
			double data, int absoluteAnomaly, java.lang.String ratioName,
			double slope) {
		this.id = id;
		this.financialYear = financialYear;
		this.data = data;
		this.absoluteAnomaly = absoluteAnomaly;
		this.ratioName = ratioName;
		this.slope = slope;
	}

}