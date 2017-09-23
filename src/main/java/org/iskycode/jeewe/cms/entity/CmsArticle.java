package org.iskycode.jeewe.cms.entity;


import org.iskycode.jeewe.sys.entity.BaseEntity;

/**
 * @author phoenix
 * <p>
 * 文章实体类
 */
public class CmsArticle extends BaseEntity {

    private String id;
    // 标题
    private String title;
    // 副标题
    private String subtitle;
    // 摘要
    private String summary;
    // 正文
    private String content;
    // 作者
    private String author;
    // 关键词
    private String keyword;
    // 类型
    private String type;
    // 状态
    private String status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
