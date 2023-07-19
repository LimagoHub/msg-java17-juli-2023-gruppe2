import de.dependency.Dependency;
import de.dependency.internal.DepB;
import de.dependency.internal.DependencyImpl;

module dependency {
	exports de.dependency;
	uses Dependency;
	provides Dependency with DependencyImpl, DepB;
}