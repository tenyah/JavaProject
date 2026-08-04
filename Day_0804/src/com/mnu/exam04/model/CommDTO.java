package com.mnu.exam04.model;

public class CommDTO {
	public DeptDTO deptDTO = new DeptDTO();
	public EmpDTO empDTO = new EmpDTO();
	
	
	
	public DeptDTO getDeptDTO() {
		return deptDTO;
	}
	public void setDeptDTO(DeptDTO deptDTO) {
		this.deptDTO = deptDTO;
	}
	public EmpDTO getEmpDTO() {
		return empDTO;
	}
	public void setEmpDTO(EmpDTO empDTO) {
		this.empDTO = empDTO;
	}
}
