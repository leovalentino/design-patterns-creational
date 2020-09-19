package br.com.factorymethod;

public class Blog extends WebSite {

	@Override
	public void createWebSite() {
		pages.add(new PostPage());
		pages.add(new AboutPage());
		pages.add(new CommentPage());
		pages.add(new ContactPage());
	}

}
