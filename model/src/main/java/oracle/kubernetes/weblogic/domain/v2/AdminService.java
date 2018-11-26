package oracle.kubernetes.weblogic.domain.v2;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Map;

public class AdminService {
    /**
     *
     */
    @SerializedName("labels")
    private Map<String, String> labels = null;
    /**
     *
     */
    @SerializedName("annotations")
    private Map<String, String> annotations = null;
    /**
     *
     */
    @SerializedName("channels")
    private Map<String, Channel> channels = null;

    public Map<String, String> getLabels() {
        return labels;
    }
    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }
    public Map<String, String> getAnnotations() {
        return annotations;
    }
    public void setAnnotations(Map<String, String> annotations) {
        this.annotations = annotations;
    }
    public Map<String, Channel> getChannels() {
        return channels;
    }
    public void setChannels(Map<String, Channel> channels) {
        this.channels = channels;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("labels", labels)
                .append("annotations", annotations)
                .append("channles", channels)
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(labels)
                .append(annotations)
                .append(channels)
                .toHashCode();
    }

    @Override
    public boolean equals(Object o) {
        if(o == null) {
            return false;
        }
        if(!(o instanceof AdminService)) {
            return false;
        }
        AdminService as = (AdminService) o;
        return new EqualsBuilder()
                .append(labels, as.labels)
                .append(annotations, as.annotations)
                .append(channels, as.channels)
                .isEquals();
    }
}
