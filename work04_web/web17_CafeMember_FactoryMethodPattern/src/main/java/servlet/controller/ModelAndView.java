package servlet.controller;

// 결과 페이지 이름 + 페이지 이동방법
public class ModelAndView {
	private String path;
	private boolean isRedirect;
	
	public ModelAndView(String path) {
		super();
		this.path = path;
	}
	
	public ModelAndView(String path, boolean isRedirect) {
		super();
		this.path = path;
		this.isRedirect = isRedirect;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public boolean isRedirect() {
		return isRedirect;
	}

	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}

	@Override
	public String toString() {
		return "ModelAndView [path=" + path + ", isRedirect=" + isRedirect + "]";
	}
}
