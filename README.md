# Showkase

TODO: Add poster

Showkase is an annotation processor based library that helps you organize, discover, search and 
visualize Jetpack Compose components. It magically generates a UI component browser with very 
minimal effort. In addition, it also helps you visualize your components in common situations 
like dark mode, RTL layouts, font scaled situations, etc.  

TODO: Add Screenshots

**Benefits**
- Showkase eliminates the manual work needed in maintaining a UI component preview/browser app that 
each ompany/team is forced to build
- Since all the available UI components are now easily searchable and discoverable, there is better 
reuse of the available components. This makes it super useful for maintaining consistency across your app.
The biggest problem for enforcing a design system is discoverability and Showkase hopefully 
solves that problem for your team.
- It allows you to quickly visualize @Composable components as you are building them. The goal is
 to improve the turnaround time in creating a production-ready @Composable component. 
- Showkase aids in catching common UI issues early with the help of autogenerated permutations that
 it renders your components in.


## Installation

Using Showkase is really straightforward and takes less than a couple minutes to get started.

**Step 1**: Add the dependency to your module's `build.gradle` file. If you have a multi-module 
setup, add this dependency to all the modules which have a `@Composable` function that you want to 
display inside the Showkase browser.

```
implementation "com.airbnb.android:showkase:0.1.0-alpha"
kapt "com.airbnb.android:showkcase-processor:0.1.0-alpha"
```

**Step 2**: Add the @Showkase annotation to every `@Composable` function/component that should 
be a part of the Showkase browser. 

```
@Showkase(name="Name of component", group="Grouping Name")
```

**Step 3**: Define an implementation of the `ShowkaseRootModule` interface in your root module. If 
your setup involves only a single module, add this implementation in that module. Ensure that this 
implementation is also annotated with the `@ShowkaseRoot` annotation.

```
@ShowkaseRoot
class MyRootModule: ShowkaseRootModule
```

**Step 4**: Showkase is now ready for use! Just start the `ShowkaseBrowserActivity` to access it. 
Typically you would start this activity from the debug menu of your app but you are free to start 
this from any place you like! `ShowkaseBrowserActivity` comes with a nice helper function that 
returns the intent you need to start. Just pass in the context & the `canonicalName` of the root 
module you created in `Step3`.
 

```
startActivity(ShowkaseBrowserActivity.getIntent(this, MyRootModule::class.java.canonicalName!!))
```

## Frequently Asked Questions

TODO

## Coming Soon!

Here are some ideas that we are thinking about. We are also not limited to these and would love 
to learn more about your use cases.

- KDoc support so that the KDoc that you added to your @Composable functions is also available in
 the Showkase browser activity.
- Support for representing more aspects of your design system. Think `@ShowkaseColor`, 
`@ShowkaseTypography`, etc.
- Hooks for screenshot testing. Since all your components are a part of the Showkase browser, 
this would be a good opportunity to make this a part of your CI and detect diffs in components. 
