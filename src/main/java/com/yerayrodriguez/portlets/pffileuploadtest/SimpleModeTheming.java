package com.yerayrodriguez.portlets.pffileuploadtest;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.UploadedFile;
import com.liferay.faces.util.logging.Logger;
import com.liferay.faces.util.logging.LoggerFactory;

@ManagedBean
@SessionScoped
public class SimpleModeTheming implements Serializable {

  private static final long serialVersionUID = 1L;
  private static Logger logger = LoggerFactory.getLogger(SimpleModeTheming.class);

  private UploadedFile file;
  private String text;

  public UploadedFile getFile() {
    return file;
  }

  public void setFile(UploadedFile file) {
    this.file = file;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public void processUpload() {
    logger.info("Text: " + text);
    if (file != null) {
      logger.info("Uploaded file: " + file.getFileName() + " " + file.getContents().length);
    } else {
      logger.info("Uploaded file: empty");
    }
    setFile(null);
    setText(null);
  }

}
