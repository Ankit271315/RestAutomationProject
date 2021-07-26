package utils;

import pojoClassPackage.BaseCredentialsClass;
import pojoClassPackage.Fields;
import pojoClassPackage.IssuePojoClass;
import pojoClassPackage.Project;

public class AddTestData {

	BaseCredentialsClass credentialsValue;
	// IssuePojoClass getCreateIssueData;
	Fields getCreateIssueData;
	Project getProjectBody;

	public BaseCredentialsClass getCredentialsBody() {
		credentialsValue.setUserName("ankitpandey");
		credentialsValue.setPassword("Shakuntla@1995");

		return credentialsValue;

	}

	public Fields getCreateIssueBody(String project, String summary, String description) {

		getProjectBody(project);
		getCreateIssueData.setSummary(summary);
		getCreateIssueData.setDescription(description);

		return getCreateIssueData;

	}

	public Project getProjectBody(String project) {
		getProjectBody.setKey(project);
		return getProjectBody;
	}

}
