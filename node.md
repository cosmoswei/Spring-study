##注解说明
- @Autowired:自动装配类型，名字,如果Autowird不能唯一自动装配上属性。则需要通过@Qualifier

- @Resource:自动装配名字，类型。

- @Nullable:字段标记了这个注解，说明这个字段可以为null

- @Component:组件，放在类上，说明这个类被Spring管理了，就是bean。

- web开发中的@Component:
1.dao  @Repository
2.service  @Service
3.controller  @Controller
***
##动态代理的好处
- 可以使真实角色操作更加纯粹，不用去关注一些公共的业务。
- 公共业务也交给代理角色，实现了业务的分工。
- 公共业务发生拓展的时候，方便集中管理。
- 一个动态代理类代理的是一个接口。一般就是对应的一类业务。
- 一个动态代理可以代理多个类，只要实现了同一个接口即可。
***