package net.anusha.ems.dto;


public class DepartmentDto {
    private Long id;
    private String departmentName;
    private String departmentDescription;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentDescription() {
		return departmentDescription;
	}
	public void setDepartmentDescription(String departmentDescription) {
		this.departmentDescription = departmentDescription;
	}
	public DepartmentDto(Long id, String departmentName, String departmentDescription) {
		super();
		this.id = id;
		this.departmentName = departmentName;
		this.departmentDescription = departmentDescription;
	}
	public DepartmentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "DepartmentDto [id=" + id + ", departmentName=" + departmentName + ", departmentDescription="
				+ departmentDescription + ", getId()=" + getId() + ", getDepartmentName()=" + getDepartmentName()
				+ ", getDepartmentDescription()=" + getDepartmentDescription() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
    
	
}