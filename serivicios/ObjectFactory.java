
package serivicios;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the serivicios package. 
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

    private final static QName _CrearPostResponse_QNAME = new QName("http://serivicios/", "crearPostResponse");
    private final static QName _GetPostsUsuario_QNAME = new QName("http://serivicios/", "getPostsUsuario");
    private final static QName _GetPostsUsuarioResponse_QNAME = new QName("http://serivicios/", "getPostsUsuarioResponse");
    private final static QName _CrearPost_QNAME = new QName("http://serivicios/", "crearPost");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: serivicios
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetPostsUsuarioResponse }
     * 
     */
    public GetPostsUsuarioResponse createGetPostsUsuarioResponse() {
        return new GetPostsUsuarioResponse();
    }

    /**
     * Create an instance of {@link CrearPost }
     * 
     */
    public CrearPost createCrearPost() {
        return new CrearPost();
    }

    /**
     * Create an instance of {@link GetPostsUsuario }
     * 
     */
    public GetPostsUsuario createGetPostsUsuario() {
        return new GetPostsUsuario();
    }

    /**
     * Create an instance of {@link CrearPostResponse }
     * 
     */
    public CrearPostResponse createCrearPostResponse() {
        return new CrearPostResponse();
    }

    /**
     * Create an instance of {@link Post }
     * 
     */
    public Post createPost() {
        return new Post();
    }

    /**
     * Create an instance of {@link Album }
     * 
     */
    public Album createAlbum() {
        return new Album();
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPostResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serivicios/", name = "crearPostResponse")
    public JAXBElement<CrearPostResponse> createCrearPostResponse(CrearPostResponse value) {
        return new JAXBElement<CrearPostResponse>(_CrearPostResponse_QNAME, CrearPostResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostsUsuario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serivicios/", name = "getPostsUsuario")
    public JAXBElement<GetPostsUsuario> createGetPostsUsuario(GetPostsUsuario value) {
        return new JAXBElement<GetPostsUsuario>(_GetPostsUsuario_QNAME, GetPostsUsuario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPostsUsuarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serivicios/", name = "getPostsUsuarioResponse")
    public JAXBElement<GetPostsUsuarioResponse> createGetPostsUsuarioResponse(GetPostsUsuarioResponse value) {
        return new JAXBElement<GetPostsUsuarioResponse>(_GetPostsUsuarioResponse_QNAME, GetPostsUsuarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPost }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://serivicios/", name = "crearPost")
    public JAXBElement<CrearPost> createCrearPost(CrearPost value) {
        return new JAXBElement<CrearPost>(_CrearPost_QNAME, CrearPost.class, null, value);
    }

}
