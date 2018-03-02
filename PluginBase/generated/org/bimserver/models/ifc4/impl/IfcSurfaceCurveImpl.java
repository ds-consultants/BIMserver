/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.ifc4.impl;

import org.bimserver.models.ifc4.Ifc4Package;
import org.bimserver.models.ifc4.IfcCurve;
import org.bimserver.models.ifc4.IfcPcurve;
import org.bimserver.models.ifc4.IfcPreferredSurfaceCurveRepresentation;
import org.bimserver.models.ifc4.IfcSurfaceCurve;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Surface Curve</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcSurfaceCurveImpl#getCurve3D <em>Curve3 D</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcSurfaceCurveImpl#getAssociatedGeometry <em>Associated Geometry</em>}</li>
 *   <li>{@link org.bimserver.models.ifc4.impl.IfcSurfaceCurveImpl#getMasterRepresentation <em>Master Representation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IfcSurfaceCurveImpl extends IfcCurveImpl implements IfcSurfaceCurve {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcSurfaceCurveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc4Package.Literals.IFC_SURFACE_CURVE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcCurve getCurve3D() {
		return (IfcCurve) eGet(Ifc4Package.Literals.IFC_SURFACE_CURVE__CURVE3_D, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurve3D(IfcCurve newCurve3D) {
		eSet(Ifc4Package.Literals.IFC_SURFACE_CURVE__CURVE3_D, newCurve3D);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcPcurve> getAssociatedGeometry() {
		return (EList<IfcPcurve>) eGet(Ifc4Package.Literals.IFC_SURFACE_CURVE__ASSOCIATED_GEOMETRY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IfcPreferredSurfaceCurveRepresentation getMasterRepresentation() {
		return (IfcPreferredSurfaceCurveRepresentation) eGet(Ifc4Package.Literals.IFC_SURFACE_CURVE__MASTER_REPRESENTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMasterRepresentation(IfcPreferredSurfaceCurveRepresentation newMasterRepresentation) {
		eSet(Ifc4Package.Literals.IFC_SURFACE_CURVE__MASTER_REPRESENTATION, newMasterRepresentation);
	}

} //IfcSurfaceCurveImpl