package models;
import play.data.validation.Constraints;

/**
 * Model class for storing keyword searched 
 * 
 * @author Parth Parekh
 * @version 1.0
 */

public class RepoData {

	@Constraints.Required
	public String keyword;

	/**
	 * 
	 * Default Constructor
	 */

	public RepoData() {
	}
	/**
	 * 
	 * 
	 * @return keyword the word of type String to be searched
	 */
	public String getKeyword() {
		return keyword;
	}
	/**
	 * 
	 * @param keyword to be set
	 */
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}