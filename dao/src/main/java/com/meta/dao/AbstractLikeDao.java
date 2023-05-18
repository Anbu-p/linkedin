package com.meta.dao;

import java.util.Collection;

/**
 * <p>
 * Provides like services for the user.
 * </p>
 *
 * @author Anbu
 * @version 1.0
 */
public abstract class AbstractLikeDao<T> implements DAO<T> {

    public abstract Collection<T> getAll(final Long commentId, final Long postId);
}
