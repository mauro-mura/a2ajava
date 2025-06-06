package io.github.vishalmysore.mcp.domain;

/**
 * A message in a prompt.
 */
public class PromptMessage {
    private Content content;
    private Role role;

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
}
