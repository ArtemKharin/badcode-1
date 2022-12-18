package main.java.ORG.EXAMPLE.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class NotifiableProduct extends Product implements NotifiableProductInterface {
    protected String channel;

    @Override
    public String generateAddressForNotification () {
        return "somerandommail@gmail.com";
    }

    @Override
    public String getBasicInfo () {
        return "NotifiableProduct{" +
                "channel='" + channel + '\'' +
                ", id=" + id +
                ", available=" + available +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}
