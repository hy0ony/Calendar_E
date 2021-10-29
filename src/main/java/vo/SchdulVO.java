package vo;

import java.util.Date;

public class SchdulVO {
	
	private long schdul_idx;
	private String schdul_nm;
	private String schdul_place;
	private Date start_date;
	private Date end_date;
	private String allday;
	private long company_idx;
	private long schdultype_idx;
	private String schdul_cont;
	private Date write_date;
	private Date update_date;
	private long sawon_idx;
	
	public long getSchdul_idx() {
		return schdul_idx;
	}
	public void setSchdul_idx(long schdul_idx) {
		this.schdul_idx = schdul_idx;
	}
	public String getSchdul_nm() {
		return schdul_nm;
	}
	public void setSchdul_nm(String schdul_nm) {
		this.schdul_nm = schdul_nm;
	}
	public String getSchdul_place() {
		return schdul_place;
	}
	public void setSchdul_place(String schdul_place) {
		this.schdul_place = schdul_place;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public String getAllday() {
		return allday;
	}
	public void setAllday(String allday) {
		this.allday = allday;
	}
	public long getCompany_idx() {
		return company_idx;
	}
	public void setCompany_idx(long company_idx) {
		this.company_idx = company_idx;
	}
	public long getSchdultype_idx() {
		return schdultype_idx;
	}
	public void setSchdultype_idx(long schdultype_idx) {
		this.schdultype_idx = schdultype_idx;
	}
	public String getSchdul_cont() {
		return schdul_cont;
	}
	public void setSchdul_cont(String schdul_cont) {
		this.schdul_cont = schdul_cont;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
	public long getSawon_idx() {
		return sawon_idx;
	}
	public void setSawon_idx(long sawon_idx) {
		this.sawon_idx = sawon_idx;
	}
	
	

}
