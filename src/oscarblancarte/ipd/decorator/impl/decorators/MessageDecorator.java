package oscarblancarte.ipd.decorator.impl.decorators;

import oscarblancarte.ipd.decorator.impl.message.IMessage;

/**
 *
 * @author Oscar Javier Blancarte Iturralde
 *
 */
public abstract class MessageDecorator implements IMessage {
    protected IMessage message;

    public MessageDecorator(IMessage message) {
        this.message = message;
    }

    @Override
    public void setContent(String content) {
        message.setContent(content);
    }

    @Override
    public String getContent() {
        return message.getContent();
    }

    @Override
    public void setFooter(String footer) {
        message.setFooter(footer);
    }

    @Override
    public String getFooter() {
        return message.getFooter();
    }
}