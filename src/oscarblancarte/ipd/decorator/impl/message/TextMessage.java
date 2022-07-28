package oscarblancarte.ipd.decorator.impl.message;

import oscarblancarte.ipd.decorator.impl.decorators.Footer;

/**
 *
 * @author Oscar Javier Blancarte Iturralde
 *
 */
public class TextMessage implements IMessage {

    private String content;

    private String footer;

    public TextMessage() {
    }

    public TextMessage(String message) {
        this.content = message;
    }

    public String getMessage() {
        return content;
    }

    public void setMessage(String message) {
        this.content = message;
    }

    @Override
    public IMessage processMessage() {
        return this;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String getFooter() {
        return footer;
    }

    @Override
    public void setFooter(String footer) {
        this.footer = footer;
    }
}