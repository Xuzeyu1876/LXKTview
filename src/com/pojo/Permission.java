package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class Permission {
    private Integer perId;

    private String perName;
    
    private String perUrl;
    
    private String perStatus;
	//显示角色权限用   
    private Integer isOwnByRole;
    
 public Integer getIsOwnByRole() {
		return isOwnByRole;
	}

	public void setIsOwnByRole(Integer isOwnByRole) {
		this.isOwnByRole = isOwnByRole;
	}


    
    
    
    

    public String getPerStatus() {
		return perStatus;
	}

	public void setPerStatus(String perStatus) {
		this.perStatus = perStatus;
	}

	public String getPerUrl() {
		return perUrl;
	}

	public void setPerUrl(String perUrl) {
		this.perUrl = perUrl;
	}

	public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
    }

    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }
}