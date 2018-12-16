//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.16 at 04:09:15 PM GST 
//


package io.infinite.blackbox.generated;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.infinite.blackbox.generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StandaloneExceptionList_QNAME = new QName("https://i-t.io/BlackBox/xsd/2_x_x/BlackBox.xsd", "standaloneExceptionList");
    private final static QName _RootAstNode_QNAME = new QName("https://i-t.io/BlackBox/xsd/2_x_x/BlackBox.xsd", "rootAstNode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.infinite.blackbox.generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link XMLStandaloneExceptionList }
     * 
     */
    public XMLStandaloneExceptionList createXMLStandaloneExceptionList() {
        return new XMLStandaloneExceptionList();
    }

    /**
     * Create an instance of {@link XMLASTNode }
     * 
     */
    public XMLASTNode createXMLASTNode() {
        return new XMLASTNode();
    }

    /**
     * Create an instance of {@link XMLArgument }
     * 
     */
    public XMLArgument createXMLArgument() {
        return new XMLArgument();
    }

    /**
     * Create an instance of {@link XMLMethodNode }
     * 
     */
    public XMLMethodNode createXMLMethodNode() {
        return new XMLMethodNode();
    }

    /**
     * Create an instance of {@link XMLExpression }
     * 
     */
    public XMLExpression createXMLExpression() {
        return new XMLExpression();
    }

    /**
     * Create an instance of {@link XMLStandaloneException }
     * 
     */
    public XMLStandaloneException createXMLStandaloneException() {
        return new XMLStandaloneException();
    }

    /**
     * Create an instance of {@link XMLStatement }
     * 
     */
    public XMLStatement createXMLStatement() {
        return new XMLStatement();
    }

    /**
     * Create an instance of {@link XMLExceptionReference }
     * 
     */
    public XMLExceptionReference createXMLExceptionReference() {
        return new XMLExceptionReference();
    }

    /**
     * Create an instance of {@link XMLObject }
     * 
     */
    public XMLObject createXMLObject() {
        return new XMLObject();
    }

    /**
     * Create an instance of {@link XMLArgumentList }
     * 
     */
    public XMLArgumentList createXMLArgumentList() {
        return new XMLArgumentList();
    }

    /**
     * Create an instance of {@link XMLASTNodeList }
     * 
     */
    public XMLASTNodeList createXMLASTNodeList() {
        return new XMLASTNodeList();
    }

    /**
     * Create an instance of {@link XMLException }
     * 
     */
    public XMLException createXMLException() {
        return new XMLException();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLStandaloneExceptionList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://i-t.io/BlackBox/xsd/2_x_x/BlackBox.xsd", name = "standaloneExceptionList")
    public JAXBElement<XMLStandaloneExceptionList> createStandaloneExceptionList(XMLStandaloneExceptionList value) {
        return new JAXBElement<XMLStandaloneExceptionList>(_StandaloneExceptionList_QNAME, XMLStandaloneExceptionList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLASTNode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://i-t.io/BlackBox/xsd/2_x_x/BlackBox.xsd", name = "rootAstNode")
    public JAXBElement<XMLASTNode> createRootAstNode(XMLASTNode value) {
        return new JAXBElement<XMLASTNode>(_RootAstNode_QNAME, XMLASTNode.class, null, value);
    }

}
