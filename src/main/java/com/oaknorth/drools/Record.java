package com.oaknorth.drools;
/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class Record implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "RECORD_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(name = "RECORD_ID_GENERATOR", sequenceName = "RECORD_ID_SEQ")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("Company Id")
	private int companyId;

	@org.kie.api.definition.type.Label("Borrower Id")
	private int borrowerId;

	@org.kie.api.definition.type.Label("Loan Id")
	private int loanId;

	@org.kie.api.definition.type.Label("Data Version")
	private java.lang.String dataVersion;

	@org.kie.api.definition.type.Label("Measurement Type")
	private java.lang.String measurementType;

	@org.kie.api.definition.type.Label("Ratio Name")
	private java.lang.String ratioName;

	@org.kie.api.definition.type.Label("Trend")
	private java.lang.String trend;

	@javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("Anomaly")
	private java.util.List<java.lang.Integer> anomaly;

	@org.kie.api.definition.type.Label("AbsoluteMajorityAnomaly")
	private int absoluteMajorityAnomaly;

	@javax.persistence.OneToMany(fetch = javax.persistence.FetchType.EAGER, cascade = {javax.persistence.CascadeType.ALL})
	@org.kie.api.definition.type.Label(value = "Ratio Values")
	private java.util.List<com.oaknorth.drools.RatioValue> ratioValues;

	public Record() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public int getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public int getBorrowerId() {
		return this.borrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}

	public int getLoanId() {
		return this.loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public java.lang.String getDataVersion() {
		return this.dataVersion;
	}

	public void setDataVersion(java.lang.String dataVersion) {
		this.dataVersion = dataVersion;
	}

	public java.lang.String getMeasurementType() {
		return this.measurementType;
	}

	public void setMeasurementType(java.lang.String measurementType) {
		this.measurementType = measurementType;
	}

	public java.lang.String getRatioName() {
		return this.ratioName;
	}

	public void setRatioName(java.lang.String ratioName) {
		this.ratioName = ratioName;
	}

	public java.lang.String getTrend() {
		return this.trend;
	}

	public void setTrend(java.lang.String trend) {
		this.trend = trend;
	}

	public java.util.List<java.lang.Integer> getAnomaly() {
		return this.anomaly;
	}

	public void setAnomaly(java.util.List<java.lang.Integer> anomaly) {
		this.anomaly = anomaly;
	}

	public int getAbsoluteMajorityAnomaly() {
		return this.absoluteMajorityAnomaly;
	}

	public void setAbsoluteMajorityAnomaly(int absoluteMajorityAnomaly) {
		this.absoluteMajorityAnomaly = absoluteMajorityAnomaly;
	}

	public java.util.List<com.oaknorth.drools.RatioValue> getRatioValues() {
		return this.ratioValues;
	}

	public void setRatioValues(
			java.util.List<com.oaknorth.drools.RatioValue> ratioValues) {
		this.ratioValues = ratioValues;
	}

	public Record(java.lang.Long id, int companyId, int borrowerId, int loanId,
			java.lang.String dataVersion, java.lang.String measurementType,
			java.lang.String ratioName, java.lang.String trend,
			java.util.List<java.lang.Integer> anomaly,
			int absoluteMajorityAnomaly,
			java.util.List<com.oaknorth.drools.RatioValue> ratioValues) {
		this.id = id;
		this.companyId = companyId;
		this.borrowerId = borrowerId;
		this.loanId = loanId;
		this.dataVersion = dataVersion;
		this.measurementType = measurementType;
		this.ratioName = ratioName;
		this.trend = trend;
		this.anomaly = anomaly;
		this.absoluteMajorityAnomaly = absoluteMajorityAnomaly;
		this.ratioValues = ratioValues;
	}

}