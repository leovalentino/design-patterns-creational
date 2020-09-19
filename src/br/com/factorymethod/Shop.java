package br.com.factorymethod;

public class Shop extends WebSite {

	@Override
	public void createWebSite() {
		pages.add(new CartPage());
		pages.add(new ItemPage());
		pages.add(new SearchPage());
	}

}
