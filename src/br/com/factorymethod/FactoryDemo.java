package br.com.factorymethod;

public class FactoryDemo {
	
	public static void main(String[] args) {
		WebSite site = WebSiteFactory.getWebSite(WebsiteType.BLOG);
		
		System.out.println(site.getPages());
		
		site = WebSiteFactory.getWebSite(WebsiteType.SHOP);
		
		System.out.println(site.getPages());
	}

}
