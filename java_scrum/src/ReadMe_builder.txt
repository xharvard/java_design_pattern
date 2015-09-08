生成器模式：一个复杂对象的构建与它的表示分离，使同样的构建过程可以创建不同的表 示

生成器模式结构中的四种角色。
产品(Product）： 所要构建的复杂对象。
抽象生成器(Builder): 抽象生成器是一个接口，该接口除了为创建一个Product对象的各个组件定义若干个方法外，
					 还要定义返回Product对象的方法。
具体生成器(ConcreteBuilder): 实现Buidler接口的类。
指挥者(Director): 指挥者是一个类，该类需含有Builder接口申明的变量，指挥者的职责是负责向用户提供具体的生成器，
				     利用具体生成器构造复杂的Product对象。
				     
Product 		-> House.java及子类
Builder 		-> IHouseBuild.java
ConcreteBuilder -> BritishStyleHouseBuilderImpl.java  ChinaStyleHouseBuilderImpl.java
Director		-> HouseDirector.java

作成日：2015/9/1