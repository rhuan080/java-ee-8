<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>

<f:view>
<html>
	<body>
		<h:form>
			<div style="border:1px solid">
				Name: <h:inputText value="#{bean.name}"/><br/><br/>

				<h:selectBooleanCheckbox value="#{bean.useTransferObject}"/>
				<h:outputText value="Use Transfer Object"/><br/>

				<h:commandButton value="Submit Remote" action="#{bean.hello}"/><br/>
				<h:commandButton value="Submit Local" action="#{bean.helloLocal}"/><br/>
			</div>
			<br/>
			Response: <h:outputText value="#{bean.response}"/>
		</h:form>
	</body>
</html>
</f:view>
