package com.cg.mobinv.mobileinventory.common.api.to;

import java.util.Date;
import java.util.List;
import org.apache.olingo.odata2.api.annotation.edm.*;

@EdmEntityType(name = "RequisitionHeader")
@EdmEntitySet(name = "RequisitionHeaderSet")
public class RequisitionHeaderTo {
	
	@EdmKey
    @EdmProperty
    private Long id;
	
	@EdmProperty
	private String requisitionDescription;
	
	@EdmProperty
	private Date requisitionDate;
	
	@EdmProperty
	private String requisitionStatus;
	
	@EdmNavigationProperty
	private List<RequisitionItemTo> toItems;
	
	public RequisitionHeaderTo() {}

	public RequisitionHeaderTo(Long id, String requisitionDescription, Date requisitionDate, String requisitionStatus,
			List<RequisitionItemTo> toItems) {
		this.id = id;
		this.requisitionDescription = requisitionDescription;
		this.requisitionDate = requisitionDate;
		this.requisitionStatus = requisitionStatus;
		this.toItems = toItems;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRequisitionDescription() {
		return requisitionDescription;
	}

	public void setRequisitionDescription(String requisitionDescription) {
		this.requisitionDescription = requisitionDescription;
	}

	public Date getRequisitionDate() {
		return requisitionDate;
	}

	public void setRequisitionDate(Date requisitionDate) {
		this.requisitionDate = requisitionDate;
	}

	public String getRequisitionStatus() {
		return requisitionStatus;
	}

	public void setRequisitionStatus(String requisitionStatus) {
		this.requisitionStatus = requisitionStatus;
	}

	public List<RequisitionItemTo> getItems() {
		return toItems;
	}

	public void setItems(List<RequisitionItemTo> toItems) {
		this.toItems = toItems;
	}
	
}
