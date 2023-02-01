//
// Generated By:JAX-WS RI IBM 2.2.1-11/28/2011 08:28 AM(foreman)- (JAXB RI IBM 2.2.3-11/28/2011 06:21 AM(foreman)-)
//


package in.co.ntpc.pradip.dop.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the in.co.ntpc.pradip.dop.service package. 
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

    private final static QName _GetPageImage_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPageImage");
    private final static QName _GetDopSection_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getDopSection");
    private final static QName _GetTotalPages_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getTotalPages");
    private final static QName _GetPageImageResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPageImageResponse");
    private final static QName _GetDopSectionResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getDopSectionResponse");
    private final static QName _GetTotalPagesResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getTotalPagesResponse");
    private final static QName _GetRomanClauseBySubClauseAndClauseAndSection_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getRomanClauseBySubClauseAndClauseAndSection");
    private final static QName _GetCurrentPage_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getCurrentPage");
    private final static QName _GetRomanClauseBySubClauseAndClauseAndSectionResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getRomanClauseBySubClauseAndClauseAndSectionResponse");
    private final static QName _GetCurrentPageResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getCurrentPageResponse");
    private final static QName _GetPreviousPage_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPreviousPage");
    private final static QName _GetPageImage2_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPageImage2");
    private final static QName _GetPageImage2Response_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPageImage2Response");
    private final static QName _GetPreviousPageResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getPreviousPageResponse");
    private final static QName _GetNextPage_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getNextPage");
    private final static QName _GetNextPageResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getNextPageResponse");
    private final static QName _SolrSearchResultWithHighlight_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "solrSearchResultWithHighlight");
    private final static QName _GetSubClauseByClauseAndSectionResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getSubClauseByClauseAndSectionResponse");
    private final static QName _GetResultBasedOnMetaData_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getResultBasedOnMetaData");
    private final static QName _GetResultBasedOnMetaDataResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getResultBasedOnMetaDataResponse");
    private final static QName _GetSubClauseByClauseAndSection_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getSubClauseByClauseAndSection");
    private final static QName _GetClauseBySectionResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getClauseBySectionResponse");
    private final static QName _SolrSearchResultWithHighlightResponse_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "solrSearchResultWithHighlightResponse");
    private final static QName _GetClauseBySection_QNAME = new QName("http://dop.pradip.ntpc.co.in/", "getClauseBySection");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: in.co.ntpc.pradip.dop.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolrSearchResultWithHighlight }
     * 
     */
    public SolrSearchResultWithHighlight createSolrSearchResultWithHighlight() {
        return new SolrSearchResultWithHighlight();
    }

    /**
     * Create an instance of {@link SolrSearchResultWithHighlightResponse }
     * 
     */
    public SolrSearchResultWithHighlightResponse createSolrSearchResultWithHighlightResponse() {
        return new SolrSearchResultWithHighlightResponse();
    }

    /**
     * Create an instance of {@link GetClauseBySection }
     * 
     */
    public GetClauseBySection createGetClauseBySection() {
        return new GetClauseBySection();
    }

    /**
     * Create an instance of {@link GetClauseBySectionResponse }
     * 
     */
    public GetClauseBySectionResponse createGetClauseBySectionResponse() {
        return new GetClauseBySectionResponse();
    }

    /**
     * Create an instance of {@link GetSubClauseByClauseAndSection }
     * 
     */
    public GetSubClauseByClauseAndSection createGetSubClauseByClauseAndSection() {
        return new GetSubClauseByClauseAndSection();
    }

    /**
     * Create an instance of {@link GetSubClauseByClauseAndSectionResponse }
     * 
     */
    public GetSubClauseByClauseAndSectionResponse createGetSubClauseByClauseAndSectionResponse() {
        return new GetSubClauseByClauseAndSectionResponse();
    }

    /**
     * Create an instance of {@link GetResultBasedOnMetaData }
     * 
     */
    public GetResultBasedOnMetaData createGetResultBasedOnMetaData() {
        return new GetResultBasedOnMetaData();
    }

    /**
     * Create an instance of {@link GetResultBasedOnMetaDataResponse }
     * 
     */
    public GetResultBasedOnMetaDataResponse createGetResultBasedOnMetaDataResponse() {
        return new GetResultBasedOnMetaDataResponse();
    }

    /**
     * Create an instance of {@link GetRomanClauseBySubClauseAndClauseAndSection }
     * 
     */
    public GetRomanClauseBySubClauseAndClauseAndSection createGetRomanClauseBySubClauseAndClauseAndSection() {
        return new GetRomanClauseBySubClauseAndClauseAndSection();
    }

    /**
     * Create an instance of {@link GetCurrentPage }
     * 
     */
    public GetCurrentPage createGetCurrentPage() {
        return new GetCurrentPage();
    }

    /**
     * Create an instance of {@link GetRomanClauseBySubClauseAndClauseAndSectionResponse }
     * 
     */
    public GetRomanClauseBySubClauseAndClauseAndSectionResponse createGetRomanClauseBySubClauseAndClauseAndSectionResponse() {
        return new GetRomanClauseBySubClauseAndClauseAndSectionResponse();
    }

    /**
     * Create an instance of {@link GetCurrentPageResponse }
     * 
     */
    public GetCurrentPageResponse createGetCurrentPageResponse() {
        return new GetCurrentPageResponse();
    }

    /**
     * Create an instance of {@link GetTotalPages }
     * 
     */
    public GetTotalPages createGetTotalPages() {
        return new GetTotalPages();
    }

    /**
     * Create an instance of {@link GetDopSection }
     * 
     */
    public GetDopSection createGetDopSection() {
        return new GetDopSection();
    }

    /**
     * Create an instance of {@link GetPageImage }
     * 
     */
    public GetPageImage createGetPageImage() {
        return new GetPageImage();
    }

    /**
     * Create an instance of {@link GetTotalPagesResponse }
     * 
     */
    public GetTotalPagesResponse createGetTotalPagesResponse() {
        return new GetTotalPagesResponse();
    }

    /**
     * Create an instance of {@link GetDopSectionResponse }
     * 
     */
    public GetDopSectionResponse createGetDopSectionResponse() {
        return new GetDopSectionResponse();
    }

    /**
     * Create an instance of {@link GetPageImageResponse }
     * 
     */
    public GetPageImageResponse createGetPageImageResponse() {
        return new GetPageImageResponse();
    }

    /**
     * Create an instance of {@link GetNextPage }
     * 
     */
    public GetNextPage createGetNextPage() {
        return new GetNextPage();
    }

    /**
     * Create an instance of {@link GetNextPageResponse }
     * 
     */
    public GetNextPageResponse createGetNextPageResponse() {
        return new GetNextPageResponse();
    }

    /**
     * Create an instance of {@link GetPageImage2 }
     * 
     */
    public GetPageImage2 createGetPageImage2() {
        return new GetPageImage2();
    }

    /**
     * Create an instance of {@link GetPreviousPage }
     * 
     */
    public GetPreviousPage createGetPreviousPage() {
        return new GetPreviousPage();
    }

    /**
     * Create an instance of {@link GetPreviousPageResponse }
     * 
     */
    public GetPreviousPageResponse createGetPreviousPageResponse() {
        return new GetPreviousPageResponse();
    }

    /**
     * Create an instance of {@link GetPageImage2Response }
     * 
     */
    public GetPageImage2Response createGetPageImage2Response() {
        return new GetPageImage2Response();
    }

    /**
     * Create an instance of {@link DopSchema }
     * 
     */
    public DopSchema createDopSchema() {
        return new DopSchema();
    }

    /**
     * Create an instance of {@link CustomSearchResult }
     * 
     */
    public CustomSearchResult createCustomSearchResult() {
        return new CustomSearchResult();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageImage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPageImage")
    public JAXBElement<GetPageImage> createGetPageImage(GetPageImage value) {
        return new JAXBElement<GetPageImage>(_GetPageImage_QNAME, GetPageImage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDopSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getDopSection")
    public JAXBElement<GetDopSection> createGetDopSection(GetDopSection value) {
        return new JAXBElement<GetDopSection>(_GetDopSection_QNAME, GetDopSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalPages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getTotalPages")
    public JAXBElement<GetTotalPages> createGetTotalPages(GetTotalPages value) {
        return new JAXBElement<GetTotalPages>(_GetTotalPages_QNAME, GetTotalPages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageImageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPageImageResponse")
    public JAXBElement<GetPageImageResponse> createGetPageImageResponse(GetPageImageResponse value) {
        return new JAXBElement<GetPageImageResponse>(_GetPageImageResponse_QNAME, GetPageImageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetDopSectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getDopSectionResponse")
    public JAXBElement<GetDopSectionResponse> createGetDopSectionResponse(GetDopSectionResponse value) {
        return new JAXBElement<GetDopSectionResponse>(_GetDopSectionResponse_QNAME, GetDopSectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTotalPagesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getTotalPagesResponse")
    public JAXBElement<GetTotalPagesResponse> createGetTotalPagesResponse(GetTotalPagesResponse value) {
        return new JAXBElement<GetTotalPagesResponse>(_GetTotalPagesResponse_QNAME, GetTotalPagesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRomanClauseBySubClauseAndClauseAndSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getRomanClauseBySubClauseAndClauseAndSection")
    public JAXBElement<GetRomanClauseBySubClauseAndClauseAndSection> createGetRomanClauseBySubClauseAndClauseAndSection(GetRomanClauseBySubClauseAndClauseAndSection value) {
        return new JAXBElement<GetRomanClauseBySubClauseAndClauseAndSection>(_GetRomanClauseBySubClauseAndClauseAndSection_QNAME, GetRomanClauseBySubClauseAndClauseAndSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getCurrentPage")
    public JAXBElement<GetCurrentPage> createGetCurrentPage(GetCurrentPage value) {
        return new JAXBElement<GetCurrentPage>(_GetCurrentPage_QNAME, GetCurrentPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRomanClauseBySubClauseAndClauseAndSectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getRomanClauseBySubClauseAndClauseAndSectionResponse")
    public JAXBElement<GetRomanClauseBySubClauseAndClauseAndSectionResponse> createGetRomanClauseBySubClauseAndClauseAndSectionResponse(GetRomanClauseBySubClauseAndClauseAndSectionResponse value) {
        return new JAXBElement<GetRomanClauseBySubClauseAndClauseAndSectionResponse>(_GetRomanClauseBySubClauseAndClauseAndSectionResponse_QNAME, GetRomanClauseBySubClauseAndClauseAndSectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrentPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getCurrentPageResponse")
    public JAXBElement<GetCurrentPageResponse> createGetCurrentPageResponse(GetCurrentPageResponse value) {
        return new JAXBElement<GetCurrentPageResponse>(_GetCurrentPageResponse_QNAME, GetCurrentPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreviousPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPreviousPage")
    public JAXBElement<GetPreviousPage> createGetPreviousPage(GetPreviousPage value) {
        return new JAXBElement<GetPreviousPage>(_GetPreviousPage_QNAME, GetPreviousPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageImage2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPageImage2")
    public JAXBElement<GetPageImage2> createGetPageImage2(GetPageImage2 value) {
        return new JAXBElement<GetPageImage2>(_GetPageImage2_QNAME, GetPageImage2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPageImage2Response }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPageImage2Response")
    public JAXBElement<GetPageImage2Response> createGetPageImage2Response(GetPageImage2Response value) {
        return new JAXBElement<GetPageImage2Response>(_GetPageImage2Response_QNAME, GetPageImage2Response.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPreviousPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getPreviousPageResponse")
    public JAXBElement<GetPreviousPageResponse> createGetPreviousPageResponse(GetPreviousPageResponse value) {
        return new JAXBElement<GetPreviousPageResponse>(_GetPreviousPageResponse_QNAME, GetPreviousPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextPage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getNextPage")
    public JAXBElement<GetNextPage> createGetNextPage(GetNextPage value) {
        return new JAXBElement<GetNextPage>(_GetNextPage_QNAME, GetNextPage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetNextPageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getNextPageResponse")
    public JAXBElement<GetNextPageResponse> createGetNextPageResponse(GetNextPageResponse value) {
        return new JAXBElement<GetNextPageResponse>(_GetNextPageResponse_QNAME, GetNextPageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolrSearchResultWithHighlight }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "solrSearchResultWithHighlight")
    public JAXBElement<SolrSearchResultWithHighlight> createSolrSearchResultWithHighlight(SolrSearchResultWithHighlight value) {
        return new JAXBElement<SolrSearchResultWithHighlight>(_SolrSearchResultWithHighlight_QNAME, SolrSearchResultWithHighlight.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubClauseByClauseAndSectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getSubClauseByClauseAndSectionResponse")
    public JAXBElement<GetSubClauseByClauseAndSectionResponse> createGetSubClauseByClauseAndSectionResponse(GetSubClauseByClauseAndSectionResponse value) {
        return new JAXBElement<GetSubClauseByClauseAndSectionResponse>(_GetSubClauseByClauseAndSectionResponse_QNAME, GetSubClauseByClauseAndSectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultBasedOnMetaData }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getResultBasedOnMetaData")
    public JAXBElement<GetResultBasedOnMetaData> createGetResultBasedOnMetaData(GetResultBasedOnMetaData value) {
        return new JAXBElement<GetResultBasedOnMetaData>(_GetResultBasedOnMetaData_QNAME, GetResultBasedOnMetaData.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetResultBasedOnMetaDataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getResultBasedOnMetaDataResponse")
    public JAXBElement<GetResultBasedOnMetaDataResponse> createGetResultBasedOnMetaDataResponse(GetResultBasedOnMetaDataResponse value) {
        return new JAXBElement<GetResultBasedOnMetaDataResponse>(_GetResultBasedOnMetaDataResponse_QNAME, GetResultBasedOnMetaDataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubClauseByClauseAndSection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getSubClauseByClauseAndSection")
    public JAXBElement<GetSubClauseByClauseAndSection> createGetSubClauseByClauseAndSection(GetSubClauseByClauseAndSection value) {
        return new JAXBElement<GetSubClauseByClauseAndSection>(_GetSubClauseByClauseAndSection_QNAME, GetSubClauseByClauseAndSection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClauseBySectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getClauseBySectionResponse")
    public JAXBElement<GetClauseBySectionResponse> createGetClauseBySectionResponse(GetClauseBySectionResponse value) {
        return new JAXBElement<GetClauseBySectionResponse>(_GetClauseBySectionResponse_QNAME, GetClauseBySectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolrSearchResultWithHighlightResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "solrSearchResultWithHighlightResponse")
    public JAXBElement<SolrSearchResultWithHighlightResponse> createSolrSearchResultWithHighlightResponse(SolrSearchResultWithHighlightResponse value) {
        return new JAXBElement<SolrSearchResultWithHighlightResponse>(_SolrSearchResultWithHighlightResponse_QNAME, SolrSearchResultWithHighlightResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetClauseBySection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dop.pradip.ntpc.co.in/", name = "getClauseBySection")
    public JAXBElement<GetClauseBySection> createGetClauseBySection(GetClauseBySection value) {
        return new JAXBElement<GetClauseBySection>(_GetClauseBySection_QNAME, GetClauseBySection.class, null, value);
    }

}