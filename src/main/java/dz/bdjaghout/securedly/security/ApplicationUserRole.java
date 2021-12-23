package dz.bdjaghout.securedly.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static dz.bdjaghout.securedly.security.ApplicationUserPermission.*;

/**
 * Created by Bilal Djaghout on 12/22/2021
 */

public enum ApplicationUserRole {
    STUDENT(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(STUDENT_READ, STUDENT_WRITE, COURSE_READ, COURSE_WRITE));

    private final Set<ApplicationUserPermission> permissionSet;


    ApplicationUserRole(Set<ApplicationUserPermission> permissionSet) {
        this.permissionSet = permissionSet;
    }

    public Set<ApplicationUserPermission> getPermissionSet() {
        return permissionSet;
    }
}
