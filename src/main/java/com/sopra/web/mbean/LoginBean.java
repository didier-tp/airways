/**
 * 
 */
package com.sopra.web.mbean;

import java.util.List;

import javax.faces.bean.ManagedProperty;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.sopra.resa.model.Client;
import com.sopra.resa.service.ServiceClient;

/**
 * @author ajc
 *
 */
// @ManagedBean
@Component
// @SessionScoped
@Scope("request")
public class LoginBean {
	private String username;

	private String password;

	@ManagedProperty(value = "#{serviceClientImpl}")
	private ServiceClient serviceClient;
	private Client client;
	private List<Client> listClient;

	public String log() {
		String suite = null;
		listClient = serviceClient.findClientByName(username);
		System.out.println(listClient);
		return suite;
	}

	public LoginBean() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 *            the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the serviceClient
	 */
	public ServiceClient getServiceClient() {
		return serviceClient;
	}

	/**
	 * @param serviceClient
	 *            the serviceClient to set
	 */
	public void setServiceClient(ServiceClient serviceClient) {
		this.serviceClient = serviceClient;
	}

	/**
	 * @return the client
	 */
	public Client getClient() {
		return client;
	}

	/**
	 * @param client
	 *            the client to set
	 */
	public void setClient(Client client) {
		this.client = client;
	}

}
