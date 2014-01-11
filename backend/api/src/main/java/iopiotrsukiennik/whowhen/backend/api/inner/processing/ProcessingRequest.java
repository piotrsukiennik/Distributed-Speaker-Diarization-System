package iopiotrsukiennik.whowhen.backend.api.inner.processing;

import iopiotrsukiennik.whowhen.backend.api.IRequestIdentifierBound;
import iopiotrsukiennik.whowhen.backend.api.inner.util.AudioInfo;

import java.io.Serializable;

/**
 * @author Piotr Sukiennik
 */
public class ProcessingRequest extends IRequestIdentifierBound implements Serializable {
    private AudioInfo convertedAudioInfo;

    public ProcessingRequest( String requestIdentifier, AudioInfo convertedAudioInfo ) {
        super( requestIdentifier );
        this.convertedAudioInfo = convertedAudioInfo;
    }

    public AudioInfo getConvertedAudioInfo() {
        return convertedAudioInfo;
    }

    @Override
    public String toString() {
        return "ProcessingRequest{" +
         "convertedAudioInfo=" + convertedAudioInfo +
         "} " + super.toString();
    }
}
