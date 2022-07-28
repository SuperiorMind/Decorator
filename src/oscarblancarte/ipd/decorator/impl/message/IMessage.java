package oscarblancarte.ipd.decorator.impl.message;

import oscarblancarte.ipd.decorator.impl.decorators.Footer;

/**
 *
 * @author Oscar Javier Blancarte Iturralde

 */
public interface IMessage {
    
    public IMessage processMessage();
    public String getContent();
    public void setContent(String content);
    public String getFooter();
    public void setFooter(String footer);
}