# java_web_development_basics





                     =============jboss AS jndi naming conventions=============

The code has some comments which will help you understand each of those lines. But we'll explain here in more detail what the code does. As a first step in the client code, we'll do a lookup of the EJB using a JNDI name. In AS7, for remote access to EJBs, you use the ejb: namespace with the following syntax:

For stateless beans:
ejb:app-name/module-name/distinct-name/bean-name!fully-qualified-classname-of-the-remote-interface

For stateful beans:
ejb:app-name/module-name/distinct-name/bean-name!fully-qualified-classname-of-the-remote-interface>stateful

The ejb: namespace identifies it as a EJB lookup and is a constant (i.e. doesn't change) for doing EJB lookups. The rest of the parts in the jndi name are as follows:
app-name : This is the name of the .ear (without the .ear suffix) that you have deployed on the server and contains your EJBs.

Java EE 6 allows you to override the application name, to a name of your choice by setting it in the application.xml. If the deployment uses uses such an override then the app-name used in the JNDI name should match that name.
EJBs can also be deployed in a .war or a plain .jar (like we did in step 1). In such cases where the deployment isn't an .ear file, then the app-name must be an empty string, while doing the lookup.

module-name : This is the name of the .jar (without the .jar suffix) that you have deployed on the server and the contains your EJBs. If the EJBs are deployed in a .war then the module name is the .war name (without the .war suffix).

Java EE 6 allows you to override the module name, by setting it in the ejb-jar.xml/web.xml of your deployment. If the deployment uses such an override then the module-name used in the JNDI name should match that name.
Module name part cannot be an empty string in the JNDI name

distinct-name : This is a WildFly-specific name which can be optionally assigned to the deployments that are deployed on the server. More about the purpose and usage of this will be explained in a separate chapter. If a deployment doesn't use distinct-name then, use an empty string in the JNDI name, for distinct-name

bean-name : This is the name of the bean for which you are doing the lookup. The bean name is typically the unqualified classname of the bean implementation class, but can be overriden through either ejb-jar.xml or via annotations. The bean name part cannot be an empty string in the JNDI name.

fully-qualified-classname-of-the-remote-interface : This is the fully qualified class name of the interface for which you are doing the lookup. The interface should be one of the remote interfaces exposed by the bean on the server. The fully qualified class name part cannot be an empty string in the JNDI name.
