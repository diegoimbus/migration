package co.cuidamos.migracion.ds.api.dto;

import java.io.Serializable;
import java.util.List;

public class UsuariosDTO implements Serializable {
	
	private String _tags;
	
	private String _user;
	
	private String email;
	
	private String phone;
	
	private boolean _enable;
	
	private String cliente;
	
	private String id_user;
	
	private boolean _checked;
	
	private String _created;
	
	private String _version;
	
	private String password;
	
	private String username;
	
	private String _modified;
	
	private String created_on;
	
	private String last_name;
	
	private String first_name;
	
	private String last_login;
	
	private String phone_cell;
	
	private String session_id;
	
	private List<SubdomainsDTO> subdomains;
	
	private String area_trabajo;
	
	private String fecha_retiro;
	
	private String fecha_ingreso;
	
	private Integer fid_groupuser;
	
	private String numero_cedula;
	
	private String turno_trabajo;
	
	private String _id_user_create;
	
	private String fecha_nacimiento;
	
	private String session_duration;
	
	private String session_client_id;
	
	private String fid_core_subdomains;
	
	private String column_id_user_create;
	
	private String capacitacion_realizada;

	
	public String get_tags() {
		return _tags;
	}

	public void set_tags(String _tags) {
		this._tags = _tags;
	}

	public String get_user() {
		return _user;
	}

	public void set_user(String _user) {
		this._user = _user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean is_enable() {
		return _enable;
	}

	public void set_enable(boolean _enable) {
		this._enable = _enable;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getId_user() {
		return id_user;
	}

	public void setId_user(String id_user) {
		this.id_user = id_user;
	}

	public boolean is_checked() {
		return _checked;
	}

	public void set_checked(boolean _checked) {
		this._checked = _checked;
	}

	public String get_created() {
		return _created;
	}

	public void set_created(String _created) {
		this._created = _created;
	}

	public String get_version() {
		return _version;
	}

	public void set_version(String _version) {
		this._version = _version;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String get_modified() {
		return _modified;
	}

	public void set_modified(String _modified) {
		this._modified = _modified;
	}

	public String getCreated_on() {
		return created_on;
	}

	public void setCreated_on(String created_on) {
		this.created_on = created_on;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_login() {
		return last_login;
	}

	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}

	public String getPhone_cell() {
		return phone_cell;
	}

	public void setPhone_cell(String phone_cell) {
		this.phone_cell = phone_cell;
	}

	public String getSession_id() {
		return session_id;
	}

	public void setSession_id(String session_id) {
		this.session_id = session_id;
	}

	public List<SubdomainsDTO> getSubdomains() {
		return subdomains;
	}

	public void setSubdomains(List<SubdomainsDTO> subdomains) {
		this.subdomains = subdomains;
	}

	public String getArea_trabajo() {
		return area_trabajo;
	}

	public void setArea_trabajo(String area_trabajo) {
		this.area_trabajo = area_trabajo;
	}

	public String getFecha_retiro() {
		return fecha_retiro;
	}

	public void setFecha_retiro(String fecha_retiro) {
		this.fecha_retiro = fecha_retiro;
	}

	public String getFecha_ingreso() {
		return fecha_ingreso;
	}

	public void setFecha_ingreso(String fecha_ingreso) {
		this.fecha_ingreso = fecha_ingreso;
	}

	public Integer getFid_groupuser() {
		return fid_groupuser;
	}

	public void setFid_groupuser(Integer fid_groupuser) {
		this.fid_groupuser = fid_groupuser;
	}

	public String getNumero_cedula() {
		return numero_cedula;
	}

	public void setNumero_cedula(String numero_cedula) {
		this.numero_cedula = numero_cedula;
	}

	public String getTurno_trabajo() {
		return turno_trabajo;
	}

	public void setTurno_trabajo(String turno_trabajo) {
		this.turno_trabajo = turno_trabajo;
	}

	public String get_id_user_create() {
		return _id_user_create;
	}

	public void set_id_user_create(String _id_user_create) {
		this._id_user_create = _id_user_create;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getSession_duration() {
		return session_duration;
	}

	public void setSession_duration(String session_duration) {
		this.session_duration = session_duration;
	}

	public String getSession_client_id() {
		return session_client_id;
	}

	public void setSession_client_id(String session_client_id) {
		this.session_client_id = session_client_id;
	}

	public String getFid_core_subdomains() {
		return fid_core_subdomains;
	}

	public void setFid_core_subdomains(String fid_core_subdomains) {
		this.fid_core_subdomains = fid_core_subdomains;
	}

	public String getColumn_id_user_create() {
		return column_id_user_create;
	}

	public void setColumn_id_user_create(String column_id_user_create) {
		this.column_id_user_create = column_id_user_create;
	}

	public String getCapacitacion_realizada() {
		return capacitacion_realizada;
	}

	public void setCapacitacion_realizada(String capacitacion_realizada) {
		this.capacitacion_realizada = capacitacion_realizada;
	}
	
	
	

}
