package com.entity;

import io.vertx.mutiny.sqlclient.Row;


public class Role {

    private Long id;

    private String roleName;

    private Boolean allPermsTag;

    private String roleIds;

    private String remark;

    public Role(Long id, String roleName, Boolean allPermsTag, String roleIds, String remark) {
        this.id = id;
        this.roleName = roleName;
        this.allPermsTag = allPermsTag;
        this.roleIds = roleIds;
        this.remark = remark;
    }

    public Role() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Boolean getAllPermsTag() {
        return allPermsTag;
    }

    public void setAllPermsTag(Boolean allPermsTag) {
        this.allPermsTag = allPermsTag;
    }

    public String getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(String roleIds) {
        this.roleIds = roleIds;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static Role from(Row row){
        return new Role(row.getLong("id"),
                row.getString("role_name"),
                row.getBoolean("all_perms_tag"),
                row.getString("role_ids"),
                row.getString("remark"));
    }
}
